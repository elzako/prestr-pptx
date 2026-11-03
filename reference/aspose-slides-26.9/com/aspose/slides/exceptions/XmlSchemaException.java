package com.aspose.slides.exceptions;

import com.aspose.slides.internal.b8c.x4;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.Xml.v3;

@j3
public class XmlSchemaException extends SystemException {
   private String n5;
   private String[] l6;
   private String k5;
   private int u3;
   private int a6;
   @e9
   private x4 u9;
   private String h0;

   public XmlSchemaException() {
      this(null);
   }

   public XmlSchemaException(String message) {
      this(message, (Exception)null, 0, 0);
   }

   public XmlSchemaException(String message, RuntimeException innerException) {
      this(message, innerException, 0, 0);
   }

   public XmlSchemaException(String message, RuntimeException innerException, int lineNumber, int linePosition) {
      this(message == null ? "A Schema error occurred." : "{0}", new String[]{message}, innerException, null, lineNumber, linePosition, null);
   }

   public XmlSchemaException(String res, String[] args) {
      this(res, args, null, null, 0, 0, null);
   }

   public XmlSchemaException(String res, String arg) {
      this(res, new String[]{arg}, null, null, 0, 0, null);
   }

   public XmlSchemaException(String res, String arg, String sourceUri, int lineNumber, int linePosition) {
      this(res, new String[]{arg}, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaException(String res, String sourceUri, int lineNumber, int linePosition) {
      this(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class), null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaException(String res, String[] args, String sourceUri, int lineNumber, int linePosition) {
      this(res, args, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaException(String res, x4 source) {
      this(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class), source);
   }

   public XmlSchemaException(String res, String arg, x4 source) {
      this(res, new String[]{arg}, source);
   }

   public XmlSchemaException(String res, String[] args, x4 source) {
      this(res, args, null, source.p8(), source.d5(), source.s3(), source);
   }

   public XmlSchemaException(String res, String[] args, RuntimeException innerException, String sourceUri, int lineNumber, int linePosition, x4 source) {
      super(createMessage(res, args), innerException);
      this.setHResult(-2146232000);
      this.n5 = res;
      this.l6 = args;
      this.k5 = sourceUri;
      this.u3 = lineNumber;
      this.a6 = linePosition;
      this.u9 = source;
   }

   public static String createMessage(String res, String[] args) {
      try {
         return v3.n5(res, args);
      } catch (MissingManifestResourceException var3) {
         return d1.n5(new String[]{"UNKNOWN(", res, ")"});
      }
   }

   public final String getGetRes() {
      return this.n5;
   }

   public final String[] getArgs() {
      return this.l6;
   }

   public final String getSourceUri() {
      return this.k5;
   }

   public final int getLineNumber() {
      return this.u3;
   }

   public final int getLinePosition() {
      return this.a6;
   }

   public final x4 getSourceSchemaObject() {
      return this.u9;
   }

   public final void setSource(String sourceUri, int lineNumber, int linePosition) {
      this.k5 = sourceUri;
      this.u3 = lineNumber;
      this.a6 = linePosition;
   }

   public final void setSchemaObject(x4 source) {
      this.u9 = source;
   }

   public final void setSource(x4 source) {
      this.u9 = source;
      this.k5 = source.p8();
      this.u3 = source.d5();
      this.a6 = source.s3();
   }

   public final void setResourceId(String resourceId) {
      this.n5 = resourceId;
   }

   @Override
   public String getMessage() {
      return this.h0 == null ? super.getMessage() : this.h0;
   }
}
