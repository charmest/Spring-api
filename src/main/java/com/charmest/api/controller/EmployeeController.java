package com.charmest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charmest.api.model.Employee;
import com.charmest.api.service.EmployeeService;

// Indique que la classe est un bean. Indique à Spring d'insérer le retour de la méthode
// au format JSON dans la réponse HTTP
@RestController
public class EmployeeController {

	// Injection d'une instance
    @Autowired
    private EmployeeService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    
    /*
     * @GetMapping : Pour la lecture de données.
     * @PostMapping : Pour l’envoi de données. Cela sera utilisé par exemple pour créer un nouvel élément.
     * @PatchMapping : Pour la mise à jour partielle de l’élément envoyé.
     * @PutMapping : Pour le remplacement complet de l’élément envoyé.
     * @DeleteMapping : Pour la suppression de l’élément envoyé.
     * @RequestMapping : Intègre tous les types HTTP. Le type souhaité est indiqué comme attribut de l’annotation. Exemple :
     * @RequestMapping(method = RequestMethod.GET)
     */

}
