class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"HelloWorld" ,action:'index')
        "500"(view:'/error')
	}
}
