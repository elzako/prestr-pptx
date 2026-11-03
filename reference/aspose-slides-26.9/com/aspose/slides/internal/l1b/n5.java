package com.aspose.slides.internal.l1b;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class n5 {
   Charset n5 = null;
   char[] l6 = null;
   int k5 = 1;

   public n5(Charset var1) throws com.aspose.slides.internal.p7x.l6 {
      this.n5 = var1;
   }

   public n5(char[] var1) throws com.aspose.slides.internal.p7x.l6 {
      this.l6 = var1;
   }

   public String n5(byte[] var1) {
      if (this.n5 != null) {
         CharBuffer var4 = this.n5.decode(ByteBuffer.wrap(var1, 0, var1.length));
         return var4.toString();
      }

      char[] var2 = new char[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = this.l6[0xFF & var1[var3]];
      }

      return new String(var2);
   }

   public int n5() {
      return this.k5;
   }

   public void n5(int var1) {
      this.k5 = var1;
   }
}
