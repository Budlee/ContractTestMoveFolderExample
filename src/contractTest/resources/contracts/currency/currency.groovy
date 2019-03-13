package currency

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/currencies'
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(
                [
                        currencyCode: "GBB",
                        currencyCode: "USD",
                        currencyCode: "CAD"
                ]
        )
        headers {
            contentType('application/json')
        }
    }
}