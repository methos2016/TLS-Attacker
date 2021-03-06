/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.modifiablevariable.filter;

final public class ModificationFilterFactory {

    private ModificationFilterFactory() {
    }

    public static AccessModificationFilter access(final int[] accessNumbers) {
	return new AccessModificationFilter(accessNumbers);
    }
}
