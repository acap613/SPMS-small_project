import { HttpHandler, HttpInterceptor, HttpRequest, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthenticationService } from './authentication.service'

@Injectable({
    providedIn: 'root'
})
export class HttpInterceptorService implements HttpInterceptor {

    constructor(private authenticationService: AuthenticationService) { }

    // intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    //     if (this.authenticationService.isUserLoggedIn() && req.url.indexOf('basicauth') === -1) {
    //         const authReq = req.clone({
    //         headers: new HttpHeaders({
    //               'Content-Type': 'application/json',
    //               'Authorization': `Basic ${window.btoa(this.authenticationService.username + ":" + this.authenticationService.password)}`
    //             })
    //         });            
    //         return next.handle(authReq);
    //     } else {
    //       return next.handle(req);
    //     }
    // }

    intercept(request: HttpRequest<any>, next: HttpHandler) {
        //    let username = 'user';
        //    let password = 'password';
        //    let basicAuthHeaderString = 'Basic ' + window.btoa(username + ':' + password);

        let basicAuthHeaderString = this.authenticationService.getAuthenticatedToken();
        let username = this.authenticationService.getAuthenticatedUser();

        if (basicAuthHeaderString && username) {
            request = request.clone({
                setHeaders: {
                    Authorization: basicAuthHeaderString
                }
            })
        }


        return next.handle(request);
    }
}
