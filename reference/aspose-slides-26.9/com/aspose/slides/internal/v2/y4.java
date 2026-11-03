package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.z3;

public class y4 extends s7 {
   private byte[] n5;

   public final byte[] n5() {
      return this.n5;
   }

   public y4(byte[] var1) {
      this.n5 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5(var1).deepClone(), byte[].class);
   }

   public y4(String var1) {
      this.n5 = new byte[0];
      boolean var2 = this.l6(var1);
      if (var2) {
         this.k5(var1);
      } else {
         this.u3(var1);
      }
   }

   private boolean l6(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         if (var1.charAt(var2) > 255) {
            return true;
         }
      }

      return false;
   }

   private void k5(String var1) {
      this.n5 = this.n5(com.aspose.slides.internal.d4.n5.n5(Byte.class, t4.l6(this.n5), (byte)-2));
      this.n5 = this.n5(com.aspose.slides.internal.d4.n5.n5(Byte.class, t4.l6(this.n5), (byte)-2));
      byte[] var2 = j5.t4().u3(var1);
      this.n5 = this.n5(com.aspose.slides.internal.d4.n5.n5(Byte.class, t4.l6(this.n5), t4.l6(var2)));
   }

   private void u3(String var1) {
      j5 var2 = j5.k5("ISO-8859-1");
      byte[] var3 = var2.u3(var1);
      this.n5 = this.n5(com.aspose.slides.internal.d4.n5.n5(Byte.class, t4.l6(this.n5), t4.l6(var3)));
   }

   private byte[] n5(Byte[] var1) {
      byte[] var2 = new byte[var1.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1[var3];
      }

      return var2;
   }

   public static y4 n5(String var0) {
      List var1 = new List();
      String var2 = d1.l6(var0);
      if (var2.length() % 2 != 0) {
         var2 = d1.l6(var2, '0');
      }

      int var3 = var2.length();

      for (int var4 = 0; var4 < var3; var4 += 2) {
         try {
            String var5 = d1.l6(var2, var4, 2);
            byte var8 = z3.n5(var5, 16);
            var1.addItem(var8);
         } catch (FormatException var7) {
            byte var6 = z3.n5("?", 16);
            var1.addItem(var6);
         }
      }

      return new y4(t4.n5(var1));
   }

   public final String l6() {
      return j5.e2().l6(this.n5);
   }

   @Override
   public String toString() {
      String var1 = j5.e2().l6(this.n5);
      return d1.n5("({0})", new Object[]{var1});
   }
}
