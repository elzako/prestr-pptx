package com.aspose.slides;

/**
 * Presentation loading configuration. Configure an instance before passing it
 * to Presentation; coordinate changes externally if sharing it across threads.
 * @see <a href="https://reference.aspose.com/slides/java/com.aspose.slides/loadoptions/">Loading contract</a>
 */
public interface ILoadOptions {
   /** Input format; LoadFormat.Auto selects format detection. */
   int getLoadFormat();

   /** Sets loadFormat. See {@link #getLoadFormat()}. */
   void setLoadFormat(int value);

   /** Fallback regular font name; null leaves font selection to the library. */
   String getDefaultRegularFont();

   /** Sets defaultRegularFont. See {@link #getDefaultRegularFont()}. */
   void setDefaultRegularFont(String value);

   /** Fallback symbol font name; null leaves font selection to the library. */
   String getDefaultSymbolFont();

   /** Sets defaultSymbolFont. See {@link #getDefaultSymbolFont()}. */
   void setDefaultSymbolFont(String value);

   /** Fallback East Asian font name; null leaves font selection to the library. */
   String getDefaultAsianFont();

   /** Sets defaultAsianFont. See {@link #getDefaultAsianFont()}. */
   void setDefaultAsianFont(String value);

   /** Password for opening an encrypted presentation; null means no password. Empty strings are rejected. */
   String getPassword();

   /** Sets password. See {@link #getPassword()}. */
   void setPassword(String value);

   /** Whether to load document properties without the complete editable presentation. Initially false. */
   boolean getOnlyLoadDocumentProperties();

   /** Sets onlyLoadDocumentProperties. See {@link #getOnlyLoadDocumentProperties()}. */
   void setOnlyLoadDocumentProperties(boolean value);

   /** Optional warning callback. Initially null. */
   IWarningCallback getWarningCallback();

   /** Sets warningCallback. See {@link #getWarningCallback()}. */
   void setWarningCallback(IWarningCallback value);

   /** Binary-data memory, locking and temporary-file policy. Initially a new BlobManagementOptions. */
   IBlobManagementOptions getBlobManagementOptions();

   /** Sets blobManagementOptions. See {@link #getBlobManagementOptions()}. */
   void setBlobManagementOptions(IBlobManagementOptions value);

   /** Font sources scoped to this document. Initially a new FontSources. */
   IFontSources getDocumentLevelFontSources();

   /** Sets documentLevelFontSources. See {@link #getDocumentLevelFontSources()}. */
   void setDocumentLevelFontSources(IFontSources value);

   /** Cooperative cancellation token. Initially InterruptionToken.getNone(). */
   IInterruptionToken getInterruptionToken();

   /** Sets interruptionToken. See {@link #getInterruptionToken()}. */
   void setInterruptionToken(IInterruptionToken value);

   /** Optional external-resource callback controlling redirection, skipping and supplied data. Initially null. */
   IResourceLoadingCallback getResourceLoadingCallback();

   /** Sets resourceLoadingCallback. See {@link #getResourceLoadingCallback()}. */
   void setResourceLoadingCallback(IResourceLoadingCallback value);

   /** Chart workbook calculation options. The no-argument constructor creates defaults; the 26.9 explicit-format constructor leaves these null. The setter rejects null. */
   ISpreadsheetOptions getSpreadsheetOptions();

   /** Sets spreadsheetOptions. See {@link #getSpreadsheetOptions()}. */
   void setSpreadsheetOptions(ISpreadsheetOptions value);

   /** Default text language identifier, such as en-US. Initially null. */
   String getDefaultTextLanguage();

   /** Sets defaultTextLanguage. See {@link #getDefaultTextLanguage()}. */
   void setDefaultTextLanguage(String value);

   /** Whether to remove embedded binary objects during loading. Initially false. */
   boolean getDeleteEmbeddedBinaryObjects();

   /** Sets deleteEmbeddedBinaryObjects. See {@link #getDeleteEmbeddedBinaryObjects()}. */
   void setDeleteEmbeddedBinaryObjects(boolean value);

}
