package net.thucy.bdd

import net.thucy.bdd.steps.AdminSteps
import net.thucy.bdd.requirements.Application.Login.LoginToSystem

using "thucydides"

thucydides.uses_steps_from AdminSteps
thucydides.tests_story LoginToSystem

scenario "Login with incorrect password", {
    given "the user is at the Login page", {
        admin.at_login_page ''
    }
    when "the end user enters correct login'", {
        admin.enter_login 'admin'
    }
    and "the end user enters incorrect password", {
    	admin.enter_password 'admin'
    }
    and "the end user clicks login button", {
    	admin.click_login_button ''
    }
    then "they should see the error message", {
    	admin.should_see_error_message ""
    }
}

scenario "Login with correct credentials", {
	given "the user is at the Login page", {
        admin.at_login_page ''
    }
    when "the end user enters correct login'", {
        admin.enter_login 'admin'
    }
    and "the end user enters correct password", {
    	admin.enter_password 'acby'
    }
    and "the end user clicks login button", {
    	admin.click_login_button ''
    }
    then "they should see the main home page", {
    	admin.at_home_page ''
    }
}