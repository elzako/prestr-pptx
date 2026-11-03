package com.aspose.slides.exceptions;

import com.aspose.slides.internal.b8c.x4;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;

@j3
public class XmlSchemaValidationException extends XmlSchemaException {
   private Object n5;

   public XmlSchemaValidationException() {
      super(null);
   }

   public XmlSchemaValidationException(String message) {
      super(message, (Exception)null, 0, 0);
   }

   public XmlSchemaValidationException(String message, RuntimeException innerException) {
      super(message, innerException, 0, 0);
   }

   public XmlSchemaValidationException(String message, RuntimeException innerException, int lineNumber, int linePosition) {
      super(message, innerException, lineNumber, linePosition);
   }

   public XmlSchemaValidationException(String res, String[] args) {
      super(res, args, null, null, 0, 0, null);
   }

   public XmlSchemaValidationException(String res, String arg) {
      super(res, new String[]{arg}, null, null, 0, 0, null);
   }

   public XmlSchemaValidationException(String res, String arg, String sourceUri, int lineNumber, int linePosition) {
      super(res, new String[]{arg}, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaValidationException(String res, String sourceUri, int lineNumber, int linePosition) {
      super(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class), null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaValidationException(String res, String[] args, String sourceUri, int lineNumber, int linePosition) {
      super(res, args, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaValidationException(String res, String[] args, RuntimeException innerException, String sourceUri, int lineNumber, int linePosition) {
      super(res, args, innerException, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaValidationException(String res, String[] args, Object sourceNode) {
      super(res, args, null, null, 0, 0, null);
      this.n5 = sourceNode;
   }

   public XmlSchemaValidationException(String res, String[] args, String sourceUri, Object sourceNode) {
      super(res, args, null, sourceUri, 0, 0, null);
      this.n5 = sourceNode;
   }

   public XmlSchemaValidationException(String res, String[] args, String sourceUri, int lineNumber, int linePosition, x4 source, Object sourceNode) {
      super(res, args, null, sourceUri, lineNumber, linePosition, source);
      this.n5 = sourceNode;
   }

   public final Object getSourceObject() {
      return this.n5;
   }

   public final void setSourceObject(Object sourceObject) {
      this.n5 = sourceObject;
   }
}
