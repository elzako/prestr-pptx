package com.aspose.slides.exceptions;

import com.aspose.slides.internal.r5t.e2;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.t9;
import com.aspose.slides.ms.System.Xml.f0;
import com.aspose.slides.ms.System.Xml.u4;
import com.aspose.slides.ms.System.Xml.v3;

@j3
public class XmlException extends SystemException {
   private String n5;
   private String[] l6;
   private int k5;
   private int u3;
   private String a6;
   private String u9;
   private static final u9 h0 = new u9("sourceUri", "version");

   public XmlException() {
      this(null);
   }

   public XmlException(String message) {
      this(message, (Exception)null, 0, 0);
   }

   public XmlException(String message, RuntimeException innerException) {
      this(message, innerException, 0, 0);
   }

   public XmlException(String message, RuntimeException innerException, int lineNumber, int linePosition) {
      this(message, innerException, lineNumber, linePosition, null);
   }

   public XmlException(String message, RuntimeException innerException, int lineNumber, int linePosition, String sourceUri) {
      super(n5(message, lineNumber, linePosition), innerException);
      this.setHResult(-2146232000);
      this.n5 = message == null ? "An XML error has occurred." : "{0}";
      this.l6 = new String[]{message};
      this.a6 = sourceUri;
      this.k5 = lineNumber;
      this.u3 = linePosition;
   }

   public XmlException(String res, String[] args) {
      this(res, args, null, 0, 0, null);
   }

   public XmlException(String res, String[] args, String sourceUri) {
      this(res, args, null, 0, 0, sourceUri);
   }

   public XmlException(String res, String arg) {
      this(res, new String[]{arg}, null, 0, 0, null);
   }

   public XmlException(String res, String arg, String sourceUri) {
      this(res, new String[]{arg}, null, 0, 0, sourceUri);
   }

   public XmlException(String res, String arg, f0 lineInfo) {
      this(res, new String[]{arg}, lineInfo, null);
   }

   public XmlException(String res, String arg, RuntimeException innerException, f0 lineInfo) {
      this(res, new String[]{arg}, innerException, lineInfo == null ? 0 : lineInfo.ah_(), lineInfo == null ? 0 : lineInfo.ai_(), null);
   }

   public XmlException(String res, String arg, f0 lineInfo, String sourceUri) {
      this(res, new String[]{arg}, lineInfo, sourceUri);
   }

   public XmlException(String res, String[] args, f0 lineInfo) {
      this(res, args, lineInfo, null);
   }

   public XmlException(String res, String[] args, f0 lineInfo, String sourceUri) {
      this(res, args, null, lineInfo == null ? 0 : lineInfo.ah_(), lineInfo == null ? 0 : lineInfo.ai_(), sourceUri);
   }

   public XmlException(String res, int lineNumber, int linePosition) {
      this(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class), null, lineNumber, linePosition);
   }

   public XmlException(String res, String arg, int lineNumber, int linePosition) {
      this(res, new String[]{arg}, null, lineNumber, linePosition, null);
   }

   public XmlException(String res, String arg, int lineNumber, int linePosition, String sourceUri) {
      this(res, new String[]{arg}, null, lineNumber, linePosition, sourceUri);
   }

   public XmlException(String res, String[] args, int lineNumber, int linePosition) {
      this(res, args, null, lineNumber, linePosition, null);
   }

   public XmlException(String res, String[] args, int lineNumber, int linePosition, String sourceUri) {
      this(res, args, null, lineNumber, linePosition, sourceUri);
   }

   public XmlException(String res, String[] args, RuntimeException innerException, int lineNumber, int linePosition) {
      this(res, args, innerException, lineNumber, linePosition, null);
   }

   public XmlException(String res, String[] args, RuntimeException innerException, int lineNumber, int linePosition, String sourceUri) {
      super(n5(res, args, lineNumber, linePosition), innerException);
      this.setHResult(-2146232000);
      this.n5 = res;
      this.l6 = args;
      this.a6 = sourceUri;
      this.k5 = lineNumber;
      this.u3 = linePosition;
   }

   private static String n5(String var0, int var1, int var2) {
      if (var0 == null) {
         return n5("An XML error has occurred.", null, var1, var2);
      } else {
         return var1 == 0 && var2 == 0 ? var0 : n5("{0}", new String[]{var0}, var1, var2);
      }
   }

   private static String n5(String var0, String[] var1, int var2, int var3) {
      try {
         String var4;
         if (var2 == 0) {
            var4 = v3.n5(var0, var1);
         } else {
            String var5 = a3.n5(var2, com.aspose.slides.internal.x7n.l6.k5());
            String var6 = a3.n5(var3, com.aspose.slides.internal.x7n.l6.k5());
            var4 = v3.n5(var0, var1);
            var4 = v3.n5("{0} Line {1}, position {2}.", var4, var5, var6);
         }

         return var4;
      } catch (MissingManifestResourceException var7) {
         return d1.n5(new String[]{"UNKNOWN(", var0, ")"});
      }
   }

   public static String[] buildCharExceptionArgs(String data, int invCharIndex) {
      return buildCharExceptionArgs(data.charAt(invCharIndex), invCharIndex + 1 < data.length() ? data.charAt(invCharIndex + 1) : '\u0000');
   }

   public static String[] buildCharExceptionArgs(char[] data, int invCharIndex) {
      return buildCharExceptionArgs(data, data.length, invCharIndex);
   }

   public static String[] buildCharExceptionArgs(char[] data, int length, int invCharIndex) {
      return buildCharExceptionArgs(data[invCharIndex], invCharIndex + 1 < length ? data[invCharIndex + 1] : '\u0000');
   }

   public static String[] buildCharExceptionArgs(char invChar, char nextChar) {
      String[] var2 = new String[2];
      if (u4.n5((int)invChar) && nextChar != 0) {
         int var3 = u4.n5(nextChar, invChar);
         var2[0] = d1.n5(new char[]{invChar, nextChar});
         var2[1] = d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "0x{0:X2}", var3);
      } else {
         if (invChar == 0) {
            var2[0] = ".";
         } else {
            var2[0] = t9.n5(invChar, (h2)com.aspose.slides.internal.x7n.l6.k5());
         }

         var2[1] = d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "0x{0:X2}", Integer.valueOf(invChar));
      }

      return var2;
   }

   public final int getLineNumber() {
      return this.k5;
   }

   public final int getLinePosition() {
      return this.u3;
   }

   public final String getSourceUri() {
      return this.a6;
   }

   @Override
   public String getMessage() {
      return this.u9 == null ? super.getMessage() : this.u9;
   }

   public final String getResString() {
      return this.n5;
   }

   public static boolean isCatchableException(RuntimeException e) {
      return !com.aspose.slides.internal.v6g.k5.l6(e, OverflowException.class)
         && !com.aspose.slides.internal.v6g.k5.l6(e, OutOfMemoryException.class)
         && !com.aspose.slides.internal.v6g.k5.l6(e, e2.class)
         && !com.aspose.slides.internal.v6g.k5.l6(e, com.aspose.slides.internal.r5t.t9.class)
         && !com.aspose.slides.internal.v6g.k5.l6(e, NullReferenceException.class)
         && !com.aspose.slides.internal.v6g.k5.l6(e, AccessViolationException.class);
   }
}
