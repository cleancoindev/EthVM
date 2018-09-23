/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.enkrypt.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Transaction extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8241717006780468987L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Transaction\",\"namespace\":\"io.enkrypt.avro\",\"fields\":[{\"name\":\"hash\",\"type\":{\"type\":\"fixed\",\"name\":\"Bytes32\",\"size\":32}},{\"name\":\"nonce\",\"type\":\"bytes\"},{\"name\":\"from\",\"type\":[\"null\",{\"type\":\"fixed\",\"name\":\"Bytes20\",\"size\":20}]},{\"name\":\"to\",\"type\":[\"null\",\"Bytes20\"]},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"gasPrice\",\"type\":\"bytes\"},{\"name\":\"gasLimit\",\"type\":\"bytes\"},{\"name\":\"data\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"receipt\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TransactionReceipt\",\"fields\":[{\"name\":\"postTxState\",\"type\":\"bytes\"},{\"name\":\"cumulativeGas\",\"type\":\"bytes\"},{\"name\":\"bloomFilter\",\"type\":\"bytes\"},{\"name\":\"gasUsed\",\"type\":\"bytes\"},{\"name\":\"executionResult\",\"type\":\"bytes\"},{\"name\":\"logs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LogInfo\",\"fields\":[{\"name\":\"address\",\"type\":\"Bytes20\"},{\"name\":\"topics\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}},{\"name\":\"data\",\"type\":\"bytes\"}]}}},{\"name\":\"error\",\"type\":[\"null\",\"string\"]},{\"name\":\"txHash\",\"type\":[\"null\",\"bytes\"]}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Transaction> ENCODER =
      new BinaryMessageEncoder<Transaction>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Transaction> DECODER =
      new BinaryMessageDecoder<Transaction>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Transaction> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Transaction> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Transaction>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Transaction to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Transaction from a ByteBuffer. */
  public static Transaction fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public io.enkrypt.avro.Bytes32 hash;
  @Deprecated public java.nio.ByteBuffer nonce;
  @Deprecated public io.enkrypt.avro.Bytes20 from;
  @Deprecated public io.enkrypt.avro.Bytes20 to;
  @Deprecated public java.nio.ByteBuffer value;
  @Deprecated public java.nio.ByteBuffer gasPrice;
  @Deprecated public java.nio.ByteBuffer gasLimit;
  @Deprecated public java.nio.ByteBuffer data;
  @Deprecated public io.enkrypt.avro.TransactionReceipt receipt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Transaction() {}

  /**
   * All-args constructor.
   * @param hash The new value for hash
   * @param nonce The new value for nonce
   * @param from The new value for from
   * @param to The new value for to
   * @param value The new value for value
   * @param gasPrice The new value for gasPrice
   * @param gasLimit The new value for gasLimit
   * @param data The new value for data
   * @param receipt The new value for receipt
   */
  public Transaction(io.enkrypt.avro.Bytes32 hash, java.nio.ByteBuffer nonce, io.enkrypt.avro.Bytes20 from, io.enkrypt.avro.Bytes20 to, java.nio.ByteBuffer value, java.nio.ByteBuffer gasPrice, java.nio.ByteBuffer gasLimit, java.nio.ByteBuffer data, io.enkrypt.avro.TransactionReceipt receipt) {
    this.hash = hash;
    this.nonce = nonce;
    this.from = from;
    this.to = to;
    this.value = value;
    this.gasPrice = gasPrice;
    this.gasLimit = gasLimit;
    this.data = data;
    this.receipt = receipt;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return hash;
    case 1: return nonce;
    case 2: return from;
    case 3: return to;
    case 4: return value;
    case 5: return gasPrice;
    case 6: return gasLimit;
    case 7: return data;
    case 8: return receipt;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: hash = (io.enkrypt.avro.Bytes32)value$; break;
    case 1: nonce = (java.nio.ByteBuffer)value$; break;
    case 2: from = (io.enkrypt.avro.Bytes20)value$; break;
    case 3: to = (io.enkrypt.avro.Bytes20)value$; break;
    case 4: value = (java.nio.ByteBuffer)value$; break;
    case 5: gasPrice = (java.nio.ByteBuffer)value$; break;
    case 6: gasLimit = (java.nio.ByteBuffer)value$; break;
    case 7: data = (java.nio.ByteBuffer)value$; break;
    case 8: receipt = (io.enkrypt.avro.TransactionReceipt)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'hash' field.
   * @return The value of the 'hash' field.
   */
  public io.enkrypt.avro.Bytes32 getHash() {
    return hash;
  }

  /**
   * Sets the value of the 'hash' field.
   * @param value the value to set.
   */
  public void setHash(io.enkrypt.avro.Bytes32 value) {
    this.hash = value;
  }

  /**
   * Gets the value of the 'nonce' field.
   * @return The value of the 'nonce' field.
   */
  public java.nio.ByteBuffer getNonce() {
    return nonce;
  }

  /**
   * Sets the value of the 'nonce' field.
   * @param value the value to set.
   */
  public void setNonce(java.nio.ByteBuffer value) {
    this.nonce = value;
  }

  /**
   * Gets the value of the 'from' field.
   * @return The value of the 'from' field.
   */
  public io.enkrypt.avro.Bytes20 getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(io.enkrypt.avro.Bytes20 value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'to' field.
   * @return The value of the 'to' field.
   */
  public io.enkrypt.avro.Bytes20 getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(io.enkrypt.avro.Bytes20 value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.nio.ByteBuffer getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.nio.ByteBuffer value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'gasPrice' field.
   * @return The value of the 'gasPrice' field.
   */
  public java.nio.ByteBuffer getGasPrice() {
    return gasPrice;
  }

  /**
   * Sets the value of the 'gasPrice' field.
   * @param value the value to set.
   */
  public void setGasPrice(java.nio.ByteBuffer value) {
    this.gasPrice = value;
  }

  /**
   * Gets the value of the 'gasLimit' field.
   * @return The value of the 'gasLimit' field.
   */
  public java.nio.ByteBuffer getGasLimit() {
    return gasLimit;
  }

  /**
   * Sets the value of the 'gasLimit' field.
   * @param value the value to set.
   */
  public void setGasLimit(java.nio.ByteBuffer value) {
    this.gasLimit = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'receipt' field.
   * @return The value of the 'receipt' field.
   */
  public io.enkrypt.avro.TransactionReceipt getReceipt() {
    return receipt;
  }

  /**
   * Sets the value of the 'receipt' field.
   * @param value the value to set.
   */
  public void setReceipt(io.enkrypt.avro.TransactionReceipt value) {
    this.receipt = value;
  }

  /**
   * Creates a new Transaction RecordBuilder.
   * @return A new Transaction RecordBuilder
   */
  public static io.enkrypt.avro.Transaction.Builder newBuilder() {
    return new io.enkrypt.avro.Transaction.Builder();
  }

  /**
   * Creates a new Transaction RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Transaction RecordBuilder
   */
  public static io.enkrypt.avro.Transaction.Builder newBuilder(io.enkrypt.avro.Transaction.Builder other) {
    return new io.enkrypt.avro.Transaction.Builder(other);
  }

  /**
   * Creates a new Transaction RecordBuilder by copying an existing Transaction instance.
   * @param other The existing instance to copy.
   * @return A new Transaction RecordBuilder
   */
  public static io.enkrypt.avro.Transaction.Builder newBuilder(io.enkrypt.avro.Transaction other) {
    return new io.enkrypt.avro.Transaction.Builder(other);
  }

  /**
   * RecordBuilder for Transaction instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Transaction>
    implements org.apache.avro.data.RecordBuilder<Transaction> {

    private io.enkrypt.avro.Bytes32 hash;
    private java.nio.ByteBuffer nonce;
    private io.enkrypt.avro.Bytes20 from;
    private io.enkrypt.avro.Bytes20 to;
    private java.nio.ByteBuffer value;
    private java.nio.ByteBuffer gasPrice;
    private java.nio.ByteBuffer gasLimit;
    private java.nio.ByteBuffer data;
    private io.enkrypt.avro.TransactionReceipt receipt;
    private io.enkrypt.avro.TransactionReceipt.Builder receiptBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.enkrypt.avro.Transaction.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.hash)) {
        this.hash = data().deepCopy(fields()[0].schema(), other.hash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nonce)) {
        this.nonce = data().deepCopy(fields()[1].schema(), other.nonce);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.from)) {
        this.from = data().deepCopy(fields()[2].schema(), other.from);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.to)) {
        this.to = data().deepCopy(fields()[3].schema(), other.to);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.value)) {
        this.value = data().deepCopy(fields()[4].schema(), other.value);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.gasPrice)) {
        this.gasPrice = data().deepCopy(fields()[5].schema(), other.gasPrice);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.gasLimit)) {
        this.gasLimit = data().deepCopy(fields()[6].schema(), other.gasLimit);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.data)) {
        this.data = data().deepCopy(fields()[7].schema(), other.data);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.receipt)) {
        this.receipt = data().deepCopy(fields()[8].schema(), other.receipt);
        fieldSetFlags()[8] = true;
      }
      if (other.hasReceiptBuilder()) {
        this.receiptBuilder = io.enkrypt.avro.TransactionReceipt.newBuilder(other.getReceiptBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Transaction instance
     * @param other The existing instance to copy.
     */
    private Builder(io.enkrypt.avro.Transaction other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.hash)) {
        this.hash = data().deepCopy(fields()[0].schema(), other.hash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nonce)) {
        this.nonce = data().deepCopy(fields()[1].schema(), other.nonce);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.from)) {
        this.from = data().deepCopy(fields()[2].schema(), other.from);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.to)) {
        this.to = data().deepCopy(fields()[3].schema(), other.to);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.value)) {
        this.value = data().deepCopy(fields()[4].schema(), other.value);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.gasPrice)) {
        this.gasPrice = data().deepCopy(fields()[5].schema(), other.gasPrice);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.gasLimit)) {
        this.gasLimit = data().deepCopy(fields()[6].schema(), other.gasLimit);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.data)) {
        this.data = data().deepCopy(fields()[7].schema(), other.data);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.receipt)) {
        this.receipt = data().deepCopy(fields()[8].schema(), other.receipt);
        fieldSetFlags()[8] = true;
      }
      this.receiptBuilder = null;
    }

    /**
      * Gets the value of the 'hash' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getHash() {
      return hash;
    }

    /**
      * Sets the value of the 'hash' field.
      * @param value The value of 'hash'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setHash(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[0], value);
      this.hash = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'hash' field has been set.
      * @return True if the 'hash' field has been set, false otherwise.
      */
    public boolean hasHash() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'hash' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearHash() {
      hash = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nonce' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getNonce() {
      return nonce;
    }

    /**
      * Sets the value of the 'nonce' field.
      * @param value The value of 'nonce'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setNonce(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.nonce = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nonce' field has been set.
      * @return True if the 'nonce' field has been set, false otherwise.
      */
    public boolean hasNonce() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nonce' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearNonce() {
      nonce = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'from' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes20 getFrom() {
      return from;
    }

    /**
      * Sets the value of the 'from' field.
      * @param value The value of 'from'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setFrom(io.enkrypt.avro.Bytes20 value) {
      validate(fields()[2], value);
      this.from = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'from' field has been set.
      * @return True if the 'from' field has been set, false otherwise.
      */
    public boolean hasFrom() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'from' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearFrom() {
      from = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'to' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes20 getTo() {
      return to;
    }

    /**
      * Sets the value of the 'to' field.
      * @param value The value of 'to'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setTo(io.enkrypt.avro.Bytes20 value) {
      validate(fields()[3], value);
      this.to = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'to' field has been set.
      * @return True if the 'to' field has been set, false otherwise.
      */
    public boolean hasTo() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'to' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearTo() {
      to = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setValue(java.nio.ByteBuffer value) {
      validate(fields()[4], value);
      this.value = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearValue() {
      value = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'gasPrice' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getGasPrice() {
      return gasPrice;
    }

    /**
      * Sets the value of the 'gasPrice' field.
      * @param value The value of 'gasPrice'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setGasPrice(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.gasPrice = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'gasPrice' field has been set.
      * @return True if the 'gasPrice' field has been set, false otherwise.
      */
    public boolean hasGasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'gasPrice' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearGasPrice() {
      gasPrice = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'gasLimit' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getGasLimit() {
      return gasLimit;
    }

    /**
      * Sets the value of the 'gasLimit' field.
      * @param value The value of 'gasLimit'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setGasLimit(java.nio.ByteBuffer value) {
      validate(fields()[6], value);
      this.gasLimit = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'gasLimit' field has been set.
      * @return True if the 'gasLimit' field has been set, false otherwise.
      */
    public boolean hasGasLimit() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'gasLimit' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearGasLimit() {
      gasLimit = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[7], value);
      this.data = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearData() {
      data = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'receipt' field.
      * @return The value.
      */
    public io.enkrypt.avro.TransactionReceipt getReceipt() {
      return receipt;
    }

    /**
      * Sets the value of the 'receipt' field.
      * @param value The value of 'receipt'.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder setReceipt(io.enkrypt.avro.TransactionReceipt value) {
      validate(fields()[8], value);
      this.receiptBuilder = null;
      this.receipt = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'receipt' field has been set.
      * @return True if the 'receipt' field has been set, false otherwise.
      */
    public boolean hasReceipt() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'receipt' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.enkrypt.avro.TransactionReceipt.Builder getReceiptBuilder() {
      if (receiptBuilder == null) {
        if (hasReceipt()) {
          setReceiptBuilder(io.enkrypt.avro.TransactionReceipt.newBuilder(receipt));
        } else {
          setReceiptBuilder(io.enkrypt.avro.TransactionReceipt.newBuilder());
        }
      }
      return receiptBuilder;
    }

    /**
     * Sets the Builder instance for the 'receipt' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.enkrypt.avro.Transaction.Builder setReceiptBuilder(io.enkrypt.avro.TransactionReceipt.Builder value) {
      clearReceipt();
      receiptBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'receipt' field has an active Builder instance
     * @return True if the 'receipt' field has an active Builder instance
     */
    public boolean hasReceiptBuilder() {
      return receiptBuilder != null;
    }

    /**
      * Clears the value of the 'receipt' field.
      * @return This builder.
      */
    public io.enkrypt.avro.Transaction.Builder clearReceipt() {
      receipt = null;
      receiptBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Transaction build() {
      try {
        Transaction record = new Transaction();
        record.hash = fieldSetFlags()[0] ? this.hash : (io.enkrypt.avro.Bytes32) defaultValue(fields()[0]);
        record.nonce = fieldSetFlags()[1] ? this.nonce : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.from = fieldSetFlags()[2] ? this.from : (io.enkrypt.avro.Bytes20) defaultValue(fields()[2]);
        record.to = fieldSetFlags()[3] ? this.to : (io.enkrypt.avro.Bytes20) defaultValue(fields()[3]);
        record.value = fieldSetFlags()[4] ? this.value : (java.nio.ByteBuffer) defaultValue(fields()[4]);
        record.gasPrice = fieldSetFlags()[5] ? this.gasPrice : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        record.gasLimit = fieldSetFlags()[6] ? this.gasLimit : (java.nio.ByteBuffer) defaultValue(fields()[6]);
        record.data = fieldSetFlags()[7] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[7]);
        if (receiptBuilder != null) {
          record.receipt = this.receiptBuilder.build();
        } else {
          record.receipt = fieldSetFlags()[8] ? this.receipt : (io.enkrypt.avro.TransactionReceipt) defaultValue(fields()[8]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Transaction>
    WRITER$ = (org.apache.avro.io.DatumWriter<Transaction>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Transaction>
    READER$ = (org.apache.avro.io.DatumReader<Transaction>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
