/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Master Information
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveMasterInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger numberOfLines;
    private final String masterLogName;
    private final ULong masterLogPos;
    private final String host;
    private final String userName;
    private final String userPassword;
    private final UInteger port;
    private final UInteger connectRetry;
    private final Byte enabledSsl;
    private final String sslCa;
    private final String sslCapath;
    private final String sslCert;
    private final String sslCipher;
    private final String sslKey;
    private final Byte sslVerifyServerCert;
    private final Double heartbeat;
    private final String bind;
    private final String ignoredServerIds;
    private final String uuid;
    private final ULong retryCount;
    private final String sslCrl;
    private final String sslCrlpath;
    private final Byte enabledAutoPosition;
    private final String channelName;
    private final String tlsVersion;
    private final String publicKeyPath;
    private final Byte getPublicKey;
    private final String networkNamespace;
    private final String masterCompressionAlgorithm;
    private final UInteger masterZstdCompressionLevel;
    private final String tlsCiphersuites;
    private final Byte sourceConnectionAutoFailover;
    private final Byte gtidOnly;

    public SlaveMasterInfo(SlaveMasterInfo value) {
        this.numberOfLines = value.numberOfLines;
        this.masterLogName = value.masterLogName;
        this.masterLogPos = value.masterLogPos;
        this.host = value.host;
        this.userName = value.userName;
        this.userPassword = value.userPassword;
        this.port = value.port;
        this.connectRetry = value.connectRetry;
        this.enabledSsl = value.enabledSsl;
        this.sslCa = value.sslCa;
        this.sslCapath = value.sslCapath;
        this.sslCert = value.sslCert;
        this.sslCipher = value.sslCipher;
        this.sslKey = value.sslKey;
        this.sslVerifyServerCert = value.sslVerifyServerCert;
        this.heartbeat = value.heartbeat;
        this.bind = value.bind;
        this.ignoredServerIds = value.ignoredServerIds;
        this.uuid = value.uuid;
        this.retryCount = value.retryCount;
        this.sslCrl = value.sslCrl;
        this.sslCrlpath = value.sslCrlpath;
        this.enabledAutoPosition = value.enabledAutoPosition;
        this.channelName = value.channelName;
        this.tlsVersion = value.tlsVersion;
        this.publicKeyPath = value.publicKeyPath;
        this.getPublicKey = value.getPublicKey;
        this.networkNamespace = value.networkNamespace;
        this.masterCompressionAlgorithm = value.masterCompressionAlgorithm;
        this.masterZstdCompressionLevel = value.masterZstdCompressionLevel;
        this.tlsCiphersuites = value.tlsCiphersuites;
        this.sourceConnectionAutoFailover = value.sourceConnectionAutoFailover;
        this.gtidOnly = value.gtidOnly;
    }

    public SlaveMasterInfo(
        UInteger numberOfLines,
        String masterLogName,
        ULong masterLogPos,
        String host,
        String userName,
        String userPassword,
        UInteger port,
        UInteger connectRetry,
        Byte enabledSsl,
        String sslCa,
        String sslCapath,
        String sslCert,
        String sslCipher,
        String sslKey,
        Byte sslVerifyServerCert,
        Double heartbeat,
        String bind,
        String ignoredServerIds,
        String uuid,
        ULong retryCount,
        String sslCrl,
        String sslCrlpath,
        Byte enabledAutoPosition,
        String channelName,
        String tlsVersion,
        String publicKeyPath,
        Byte getPublicKey,
        String networkNamespace,
        String masterCompressionAlgorithm,
        UInteger masterZstdCompressionLevel,
        String tlsCiphersuites,
        Byte sourceConnectionAutoFailover,
        Byte gtidOnly
    ) {
        this.numberOfLines = numberOfLines;
        this.masterLogName = masterLogName;
        this.masterLogPos = masterLogPos;
        this.host = host;
        this.userName = userName;
        this.userPassword = userPassword;
        this.port = port;
        this.connectRetry = connectRetry;
        this.enabledSsl = enabledSsl;
        this.sslCa = sslCa;
        this.sslCapath = sslCapath;
        this.sslCert = sslCert;
        this.sslCipher = sslCipher;
        this.sslKey = sslKey;
        this.sslVerifyServerCert = sslVerifyServerCert;
        this.heartbeat = heartbeat;
        this.bind = bind;
        this.ignoredServerIds = ignoredServerIds;
        this.uuid = uuid;
        this.retryCount = retryCount;
        this.sslCrl = sslCrl;
        this.sslCrlpath = sslCrlpath;
        this.enabledAutoPosition = enabledAutoPosition;
        this.channelName = channelName;
        this.tlsVersion = tlsVersion;
        this.publicKeyPath = publicKeyPath;
        this.getPublicKey = getPublicKey;
        this.networkNamespace = networkNamespace;
        this.masterCompressionAlgorithm = masterCompressionAlgorithm;
        this.masterZstdCompressionLevel = masterZstdCompressionLevel;
        this.tlsCiphersuites = tlsCiphersuites;
        this.sourceConnectionAutoFailover = sourceConnectionAutoFailover;
        this.gtidOnly = gtidOnly;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Number_of_lines</code>. Number
     * of lines in the file.
     */
    public UInteger getNumberOfLines() {
        return this.numberOfLines;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Master_log_name</code>. The name
     * of the master binary log currently being read from the master.
     */
    public String getMasterLogName() {
        return this.masterLogName;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Master_log_pos</code>. The
     * master log position of the last read event.
     */
    public ULong getMasterLogPos() {
        return this.masterLogPos;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Host</code>. The host name of
     * the source.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>mysql.slave_master_info.User_name</code>. The user name
     * used to connect to the master.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Getter for <code>mysql.slave_master_info.User_password</code>. The
     * password used to connect to the master.
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Port</code>. The network port
     * used to connect to the master.
     */
    public UInteger getPort() {
        return this.port;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Connect_retry</code>. The period
     * (in seconds) that the slave will wait before trying to reconnect to the
     * master.
     */
    public UInteger getConnectRetry() {
        return this.connectRetry;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Enabled_ssl</code>. Indicates
     * whether the server supports SSL connections.
     */
    public Byte getEnabledSsl() {
        return this.enabledSsl;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_ca</code>. The file used for
     * the Certificate Authority (CA) certificate.
     */
    public String getSslCa() {
        return this.sslCa;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_capath</code>. The path to
     * the Certificate Authority (CA) certificates.
     */
    public String getSslCapath() {
        return this.sslCapath;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_cert</code>. The name of the
     * SSL certificate file.
     */
    public String getSslCert() {
        return this.sslCert;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_cipher</code>. The name of
     * the cipher in use for the SSL connection.
     */
    public String getSslCipher() {
        return this.sslCipher;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_key</code>. The name of the
     * SSL key file.
     */
    public String getSslKey() {
        return this.sslKey;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_verify_server_cert</code>.
     * Whether to verify the server certificate.
     */
    public Byte getSslVerifyServerCert() {
        return this.sslVerifyServerCert;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Heartbeat</code>.
     */
    public Double getHeartbeat() {
        return this.heartbeat;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Bind</code>. Displays which
     * interface is employed when connecting to the MySQL server
     */
    public String getBind() {
        return this.bind;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ignored_server_ids</code>. The
     * number of server IDs to be ignored, followed by the actual server IDs
     */
    public String getIgnoredServerIds() {
        return this.ignoredServerIds;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Uuid</code>. The master server
     * uuid.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Retry_count</code>. Number of
     * reconnect attempts, to the master, before giving up.
     */
    public ULong getRetryCount() {
        return this.retryCount;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_crl</code>. The file used
     * for the Certificate Revocation List (CRL)
     */
    public String getSslCrl() {
        return this.sslCrl;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_crlpath</code>. The path
     * used for Certificate Revocation List (CRL) files
     */
    public String getSslCrlpath() {
        return this.sslCrlpath;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Enabled_auto_position</code>.
     * Indicates whether GTIDs will be used to retrieve events from the master.
     */
    public Byte getEnabledAutoPosition() {
        return this.enabledAutoPosition;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Channel_name</code>. The channel
     * on which the replica is connected to a source. Used in Multisource
     * Replication
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Tls_version</code>. Tls version
     */
    public String getTlsVersion() {
        return this.tlsVersion;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Public_key_path</code>. The file
     * containing public key of master server.
     */
    public String getPublicKeyPath() {
        return this.publicKeyPath;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Get_public_key</code>.
     * Preference to get public key from master.
     */
    public Byte getGetPublicKey() {
        return this.getPublicKey;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Network_namespace</code>.
     * Network namespace used for communication with the master server.
     */
    public String getNetworkNamespace() {
        return this.networkNamespace;
    }

    /**
     * Getter for
     * <code>mysql.slave_master_info.Master_compression_algorithm</code>.
     * Compression algorithm supported for data transfer between source and
     * replica.
     */
    public String getMasterCompressionAlgorithm() {
        return this.masterCompressionAlgorithm;
    }

    /**
     * Getter for
     * <code>mysql.slave_master_info.Master_zstd_compression_level</code>.
     * Compression level associated with zstd compression algorithm.
     */
    public UInteger getMasterZstdCompressionLevel() {
        return this.masterZstdCompressionLevel;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Tls_ciphersuites</code>.
     * Ciphersuites used for TLS 1.3 communication with the master server.
     */
    public String getTlsCiphersuites() {
        return this.tlsCiphersuites;
    }

    /**
     * Getter for
     * <code>mysql.slave_master_info.Source_connection_auto_failover</code>.
     * Indicates whether the channel connection failover is enabled.
     */
    public Byte getSourceConnectionAutoFailover() {
        return this.sourceConnectionAutoFailover;
    }

    /**
     * Getter for <code>mysql.slave_master_info.Gtid_only</code>. Indicates if
     * this channel only uses GTIDs and does not persist positions.
     */
    public Byte getGtidOnly() {
        return this.gtidOnly;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SlaveMasterInfo other = (SlaveMasterInfo) obj;
        if (this.numberOfLines == null) {
            if (other.numberOfLines != null)
                return false;
        }
        else if (!this.numberOfLines.equals(other.numberOfLines))
            return false;
        if (this.masterLogName == null) {
            if (other.masterLogName != null)
                return false;
        }
        else if (!this.masterLogName.equals(other.masterLogName))
            return false;
        if (this.masterLogPos == null) {
            if (other.masterLogPos != null)
                return false;
        }
        else if (!this.masterLogPos.equals(other.masterLogPos))
            return false;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.userName == null) {
            if (other.userName != null)
                return false;
        }
        else if (!this.userName.equals(other.userName))
            return false;
        if (this.userPassword == null) {
            if (other.userPassword != null)
                return false;
        }
        else if (!this.userPassword.equals(other.userPassword))
            return false;
        if (this.port == null) {
            if (other.port != null)
                return false;
        }
        else if (!this.port.equals(other.port))
            return false;
        if (this.connectRetry == null) {
            if (other.connectRetry != null)
                return false;
        }
        else if (!this.connectRetry.equals(other.connectRetry))
            return false;
        if (this.enabledSsl == null) {
            if (other.enabledSsl != null)
                return false;
        }
        else if (!this.enabledSsl.equals(other.enabledSsl))
            return false;
        if (this.sslCa == null) {
            if (other.sslCa != null)
                return false;
        }
        else if (!this.sslCa.equals(other.sslCa))
            return false;
        if (this.sslCapath == null) {
            if (other.sslCapath != null)
                return false;
        }
        else if (!this.sslCapath.equals(other.sslCapath))
            return false;
        if (this.sslCert == null) {
            if (other.sslCert != null)
                return false;
        }
        else if (!this.sslCert.equals(other.sslCert))
            return false;
        if (this.sslCipher == null) {
            if (other.sslCipher != null)
                return false;
        }
        else if (!this.sslCipher.equals(other.sslCipher))
            return false;
        if (this.sslKey == null) {
            if (other.sslKey != null)
                return false;
        }
        else if (!this.sslKey.equals(other.sslKey))
            return false;
        if (this.sslVerifyServerCert == null) {
            if (other.sslVerifyServerCert != null)
                return false;
        }
        else if (!this.sslVerifyServerCert.equals(other.sslVerifyServerCert))
            return false;
        if (this.heartbeat == null) {
            if (other.heartbeat != null)
                return false;
        }
        else if (!this.heartbeat.equals(other.heartbeat))
            return false;
        if (this.bind == null) {
            if (other.bind != null)
                return false;
        }
        else if (!this.bind.equals(other.bind))
            return false;
        if (this.ignoredServerIds == null) {
            if (other.ignoredServerIds != null)
                return false;
        }
        else if (!this.ignoredServerIds.equals(other.ignoredServerIds))
            return false;
        if (this.uuid == null) {
            if (other.uuid != null)
                return false;
        }
        else if (!this.uuid.equals(other.uuid))
            return false;
        if (this.retryCount == null) {
            if (other.retryCount != null)
                return false;
        }
        else if (!this.retryCount.equals(other.retryCount))
            return false;
        if (this.sslCrl == null) {
            if (other.sslCrl != null)
                return false;
        }
        else if (!this.sslCrl.equals(other.sslCrl))
            return false;
        if (this.sslCrlpath == null) {
            if (other.sslCrlpath != null)
                return false;
        }
        else if (!this.sslCrlpath.equals(other.sslCrlpath))
            return false;
        if (this.enabledAutoPosition == null) {
            if (other.enabledAutoPosition != null)
                return false;
        }
        else if (!this.enabledAutoPosition.equals(other.enabledAutoPosition))
            return false;
        if (this.channelName == null) {
            if (other.channelName != null)
                return false;
        }
        else if (!this.channelName.equals(other.channelName))
            return false;
        if (this.tlsVersion == null) {
            if (other.tlsVersion != null)
                return false;
        }
        else if (!this.tlsVersion.equals(other.tlsVersion))
            return false;
        if (this.publicKeyPath == null) {
            if (other.publicKeyPath != null)
                return false;
        }
        else if (!this.publicKeyPath.equals(other.publicKeyPath))
            return false;
        if (this.getPublicKey == null) {
            if (other.getPublicKey != null)
                return false;
        }
        else if (!this.getPublicKey.equals(other.getPublicKey))
            return false;
        if (this.networkNamespace == null) {
            if (other.networkNamespace != null)
                return false;
        }
        else if (!this.networkNamespace.equals(other.networkNamespace))
            return false;
        if (this.masterCompressionAlgorithm == null) {
            if (other.masterCompressionAlgorithm != null)
                return false;
        }
        else if (!this.masterCompressionAlgorithm.equals(other.masterCompressionAlgorithm))
            return false;
        if (this.masterZstdCompressionLevel == null) {
            if (other.masterZstdCompressionLevel != null)
                return false;
        }
        else if (!this.masterZstdCompressionLevel.equals(other.masterZstdCompressionLevel))
            return false;
        if (this.tlsCiphersuites == null) {
            if (other.tlsCiphersuites != null)
                return false;
        }
        else if (!this.tlsCiphersuites.equals(other.tlsCiphersuites))
            return false;
        if (this.sourceConnectionAutoFailover == null) {
            if (other.sourceConnectionAutoFailover != null)
                return false;
        }
        else if (!this.sourceConnectionAutoFailover.equals(other.sourceConnectionAutoFailover))
            return false;
        if (this.gtidOnly == null) {
            if (other.gtidOnly != null)
                return false;
        }
        else if (!this.gtidOnly.equals(other.gtidOnly))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.numberOfLines == null) ? 0 : this.numberOfLines.hashCode());
        result = prime * result + ((this.masterLogName == null) ? 0 : this.masterLogName.hashCode());
        result = prime * result + ((this.masterLogPos == null) ? 0 : this.masterLogPos.hashCode());
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.userName == null) ? 0 : this.userName.hashCode());
        result = prime * result + ((this.userPassword == null) ? 0 : this.userPassword.hashCode());
        result = prime * result + ((this.port == null) ? 0 : this.port.hashCode());
        result = prime * result + ((this.connectRetry == null) ? 0 : this.connectRetry.hashCode());
        result = prime * result + ((this.enabledSsl == null) ? 0 : this.enabledSsl.hashCode());
        result = prime * result + ((this.sslCa == null) ? 0 : this.sslCa.hashCode());
        result = prime * result + ((this.sslCapath == null) ? 0 : this.sslCapath.hashCode());
        result = prime * result + ((this.sslCert == null) ? 0 : this.sslCert.hashCode());
        result = prime * result + ((this.sslCipher == null) ? 0 : this.sslCipher.hashCode());
        result = prime * result + ((this.sslKey == null) ? 0 : this.sslKey.hashCode());
        result = prime * result + ((this.sslVerifyServerCert == null) ? 0 : this.sslVerifyServerCert.hashCode());
        result = prime * result + ((this.heartbeat == null) ? 0 : this.heartbeat.hashCode());
        result = prime * result + ((this.bind == null) ? 0 : this.bind.hashCode());
        result = prime * result + ((this.ignoredServerIds == null) ? 0 : this.ignoredServerIds.hashCode());
        result = prime * result + ((this.uuid == null) ? 0 : this.uuid.hashCode());
        result = prime * result + ((this.retryCount == null) ? 0 : this.retryCount.hashCode());
        result = prime * result + ((this.sslCrl == null) ? 0 : this.sslCrl.hashCode());
        result = prime * result + ((this.sslCrlpath == null) ? 0 : this.sslCrlpath.hashCode());
        result = prime * result + ((this.enabledAutoPosition == null) ? 0 : this.enabledAutoPosition.hashCode());
        result = prime * result + ((this.channelName == null) ? 0 : this.channelName.hashCode());
        result = prime * result + ((this.tlsVersion == null) ? 0 : this.tlsVersion.hashCode());
        result = prime * result + ((this.publicKeyPath == null) ? 0 : this.publicKeyPath.hashCode());
        result = prime * result + ((this.getPublicKey == null) ? 0 : this.getPublicKey.hashCode());
        result = prime * result + ((this.networkNamespace == null) ? 0 : this.networkNamespace.hashCode());
        result = prime * result + ((this.masterCompressionAlgorithm == null) ? 0 : this.masterCompressionAlgorithm.hashCode());
        result = prime * result + ((this.masterZstdCompressionLevel == null) ? 0 : this.masterZstdCompressionLevel.hashCode());
        result = prime * result + ((this.tlsCiphersuites == null) ? 0 : this.tlsCiphersuites.hashCode());
        result = prime * result + ((this.sourceConnectionAutoFailover == null) ? 0 : this.sourceConnectionAutoFailover.hashCode());
        result = prime * result + ((this.gtidOnly == null) ? 0 : this.gtidOnly.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SlaveMasterInfo (");

        sb.append(numberOfLines);
        sb.append(", ").append(masterLogName);
        sb.append(", ").append(masterLogPos);
        sb.append(", ").append(host);
        sb.append(", ").append(userName);
        sb.append(", ").append(userPassword);
        sb.append(", ").append(port);
        sb.append(", ").append(connectRetry);
        sb.append(", ").append(enabledSsl);
        sb.append(", ").append(sslCa);
        sb.append(", ").append(sslCapath);
        sb.append(", ").append(sslCert);
        sb.append(", ").append(sslCipher);
        sb.append(", ").append(sslKey);
        sb.append(", ").append(sslVerifyServerCert);
        sb.append(", ").append(heartbeat);
        sb.append(", ").append(bind);
        sb.append(", ").append(ignoredServerIds);
        sb.append(", ").append(uuid);
        sb.append(", ").append(retryCount);
        sb.append(", ").append(sslCrl);
        sb.append(", ").append(sslCrlpath);
        sb.append(", ").append(enabledAutoPosition);
        sb.append(", ").append(channelName);
        sb.append(", ").append(tlsVersion);
        sb.append(", ").append(publicKeyPath);
        sb.append(", ").append(getPublicKey);
        sb.append(", ").append(networkNamespace);
        sb.append(", ").append(masterCompressionAlgorithm);
        sb.append(", ").append(masterZstdCompressionLevel);
        sb.append(", ").append(tlsCiphersuites);
        sb.append(", ").append(sourceConnectionAutoFailover);
        sb.append(", ").append(gtidOnly);

        sb.append(")");
        return sb.toString();
    }
}