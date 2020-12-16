import { NgModule } from '@angular/core'; 
import { Routes, RouterModule } from '@angular/router';
import { AuthorCreationComponent } from './author-creation/author-creation.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { StoryPitchFormComponent } from './story-pitch-form/story-pitch-form.component';
import { StoryPitchesComponent } from './story-pitches/story-pitches.component';

const routes: Routes = [
    { path: '', component: LoginPageComponent },
    { path: 'home', component: HomePageComponent },
    { path: 'login', component: LoginPageComponent},
    { path: 'form', component: StoryPitchFormComponent},
    { path: 'form/:id', component: StoryPitchFormComponent},
    { path: 'list', component: StoryPitchesComponent},
    { path: 'newauthor', component: AuthorCreationComponent}
    //{ path: '**', component: ErrorComponent }
    


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
