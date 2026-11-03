package com.aspose.slides.exceptions;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;

@j3
public class XmlSchemaInferenceException extends XmlSchemaException {
   public XmlSchemaInferenceException() {
      super(null);
   }

   public XmlSchemaInferenceException(String message) {
      super(message, (Exception)null, 0, 0);
   }

   public XmlSchemaInferenceException(String message, RuntimeException innerException) {
      super(message, innerException, 0, 0);
   }

   public XmlSchemaInferenceException(String message, RuntimeException innerException, int lineNumber, int linePosition) {
      super(message, innerException, lineNumber, linePosition);
   }

   public XmlSchemaInferenceException(String res, String[] args) {
      super(res, args, null, null, 0, 0, null);
   }

   public XmlSchemaInferenceException(String res, String arg) {
      super(res, new String[]{arg}, null, null, 0, 0, null);
   }

   public XmlSchemaInferenceException(String res, String arg, String sourceUri, int lineNumber, int linePosition) {
      super(res, new String[]{arg}, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaInferenceException(String res, String sourceUri, int lineNumber, int linePosition) {
      super(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class), null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaInferenceException(String res, String[] args, String sourceUri, int lineNumber, int linePosition) {
      super(res, args, null, sourceUri, lineNumber, linePosition, null);
   }

   public XmlSchemaInferenceException(String res, int lineNumber, int linePosition) {
      super(res, null, null, null, lineNumber, linePosition, null);
   }
}
