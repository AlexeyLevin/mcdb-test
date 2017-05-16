package ru.moex.api.organization.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.moex.api.organization.entity.Organization;
import ru.moex.api.organization.service.OrganizationService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Routing
 * POST     /organizations/
 * PUT      /organizations/
 * DELETE   /organizations/
 * GET      /organizations?page={num}&limit={num}
 * GET      /organizations?organizationGroup={id}&page={num}&limit={num}
 * GET      /organizations/{id}
 */
@RestController
@RequestMapping("/organizations")
public class OrganizationRestController {
    private OrganizationService organizationService;

    public OrganizationRestController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Organization> add(@RequestBody Organization organization) {
        //todo
        return ResponseEntity.ok(organization);
    }

    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Organization> update(@RequestBody Organization organization) {
        //todo
        return ResponseEntity.ok(organization);
    }

    @DeleteMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Organization> delete(@RequestBody Organization organization) {
        //todo
        return ResponseEntity.ok(organization);
    }

    @GetMapping(params = {"page", "limit"}, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Organization>> findAll(@RequestParam Integer page, @RequestParam Integer limit) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Pagination-Count", organizationService.totalCount().toString());
        headers.set("X-Pagination-Page", page.toString());
        headers.set("X-Pagination-Limit", limit.toString());
        return ResponseEntity.ok().headers(headers).body(organizationService.findAll(page, limit));
    }

    @GetMapping(params = {"groupId", "page", "limit"}, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Organization>> findAllByOrganizationGroupId(@RequestParam Long groupId,
                                                                           @RequestParam Integer page,
                                                                           @RequestParam Integer limit) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Pagination-Count", organizationService.totalCount().toString());
        headers.set("X-Pagination-Page", page.toString());
        headers.set("X-Pagination-Limit", limit.toString());
        return ResponseEntity.ok()
                             .headers(headers)
                             .body(organizationService.findAllByOrganizationGroupId(groupId, page, limit));
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Organization> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(organizationService.findById(id));
    }
}
