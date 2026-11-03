package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

/**
 * Mutable loading settings; see ILoadOptions for defaults and ownership.
 * Constructor-specific spreadsheet defaults intentionally match version 26.9.
 * @see ILoadOptions
 */
public class LoadOptions implements ILoadOptions {
   private String defaultTextLanguage;
   private boolean deleteEmbeddedBinaryObjects;
   private int loadFormat;
   private String defaultRegularFont;
   private String defaultSymbolFont;
   private String defaultAsianFont;
   private String password;
   private boolean onlyLoadDocumentProperties;
   private IWarningCallback warningCallback;
   private s4e presentationState;
   private IBlobManagementOptions blobManagementOptions = new BlobManagementOptions();
   private IFontSources documentLevelFontSources = new FontSources();
   private IInterruptionToken interruptionToken = InterruptionToken.getNone();
   private IResourceLoadingCallback resourceLoadingCallback;
   private ISpreadsheetOptions spreadsheetOptions;

   /** Creates automatic-format settings with default spreadsheet options. */
   public LoadOptions() {
      this.loadFormat = LoadFormat.Auto;
      this.spreadsheetOptions = new SpreadsheetOptions();
   }

   /** Creates explicit-format settings; spreadsheet options initially remain null in 26.9. */
   public LoadOptions(int loadFormat) {
      this.loadFormat = loadFormat;
   }

   @Override
   public final int getLoadFormat() {
      return this.loadFormat;
   }

   @Override
   public final void setLoadFormat(int value) {
      this.loadFormat = value;
   }

   @Override
   public final String getDefaultRegularFont() {
      return this.defaultRegularFont;
   }

   @Override
   public final void setDefaultRegularFont(String value) {
      this.defaultRegularFont = value;
   }

   @Override
   public final String getDefaultSymbolFont() {
      return this.defaultSymbolFont;
   }

   @Override
   public final void setDefaultSymbolFont(String value) {
      this.defaultSymbolFont = value;
   }

   @Override
   public final String getDefaultAsianFont() {
      return this.defaultAsianFont;
   }

   @Override
   public final void setDefaultAsianFont(String value) {
      this.defaultAsianFont = value;
   }

   @Override
   public final String getPassword() {
      return this.password;
   }

   @Override
   public final void setPassword(String value) {
      if ("".equals(value)) {
         throw new ArgumentException("Password can't be an empty string", "value");
      }

      this.password = value;
   }

   @Override
   public final boolean getOnlyLoadDocumentProperties() {
      return this.onlyLoadDocumentProperties;
   }

   @Override
   public final void setOnlyLoadDocumentProperties(boolean value) {
      this.onlyLoadDocumentProperties = value;
   }

   @Override
   public final IWarningCallback getWarningCallback() {
      return this.warningCallback;
   }

   @Override
   public final void setWarningCallback(IWarningCallback value) {
      this.warningCallback = value;
   }

   @Override
   public final IBlobManagementOptions getBlobManagementOptions() {
      return this.blobManagementOptions;
   }

   @Override
   public final void setBlobManagementOptions(IBlobManagementOptions value) {
      this.blobManagementOptions = value;
   }

   @Override
   public final IFontSources getDocumentLevelFontSources() {
      return this.documentLevelFontSources;
   }

   @Override
   public final void setDocumentLevelFontSources(IFontSources value) {
      this.documentLevelFontSources = value;
   }

   @Override
   public final IInterruptionToken getInterruptionToken() {
      return this.interruptionToken;
   }

   @Override
   public final void setInterruptionToken(IInterruptionToken value) {
      this.interruptionToken = value;
   }

   @Override
   public final IResourceLoadingCallback getResourceLoadingCallback() {
      return this.resourceLoadingCallback;
   }

   @Override
   public final void setResourceLoadingCallback(IResourceLoadingCallback value) {
      this.resourceLoadingCallback = value;
   }

   @Override
   public final ISpreadsheetOptions getSpreadsheetOptions() {
      return this.spreadsheetOptions;
   }

   @Override
   public final void setSpreadsheetOptions(ISpreadsheetOptions value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      }

      this.spreadsheetOptions = value;
   }

   @Override
   public final String getDefaultTextLanguage() {
      return this.defaultTextLanguage;
   }

   @Override
   public final void setDefaultTextLanguage(String value) {
      this.defaultTextLanguage = value;
   }

   @Override
   public final boolean getDeleteEmbeddedBinaryObjects() {
      return this.deleteEmbeddedBinaryObjects;
   }

   @Override
   public final void setDeleteEmbeddedBinaryObjects(boolean value) {
      this.deleteEmbeddedBinaryObjects = value;
   }

   final s4e n5() {
      return this.presentationState;
   }

   final void n5(s4e var1) {
      this.presentationState = var1;
   }

   final boolean l6() {
      return this.password != null;
   }

   final void k5() {
      if (this.getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.a3 var1 = new com.aspose.slides.internal.n8e.a3();
         var1.sendWarning(this.getWarningCallback());
      }
   }

   final void n5(String var1, int var2) {
      if (this.getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.getWarningCallback());
      }
   }
}
