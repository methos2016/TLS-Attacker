/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.attacks.pkcs1.oracles;

import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;

/**
 * 
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class StdPlainPkcs1Oracle extends TestPkcs1Oracle {

    public StdPlainPkcs1Oracle(final PublicKey pubKey, final TestPkcs1Oracle.OracleType oracleType, final int blockSize) {
	this.publicKey = (RSAPublicKey) pubKey;
	this.oracleType = oracleType;
	this.isPlaintextOracle = true;
	this.blockSize = blockSize;
    }

    @Override
    public boolean checkPKCSConformity(final byte[] msg) {
	numberOfQueries++;
	return checkDecryptedBytes(msg);
    }
}
