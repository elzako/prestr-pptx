package com.aspose.slides.internal.b8;

import com.aspose.slides.internal.j7.e2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.t9;
import com.aspose.slides.ms.System.Xml.k3;

public class n5 {
   private final k3 n5;
   private final a5 l6;

   public n5(t4 var1, j5 var2, boolean var3) {
      if (var2.t9() == 65000) {
         byte[] var4 = var2.c8();
         if (var4.length == 0) {
            var4 = a6.n5();
            var1.write(var4, 0, var4.length);
         }
      }

      this.n5 = e2.n5(var1, var2);
      this.l6 = new a5(2048);
      this.n5.k5(false);
      if (var3) {
         this.n5.n5(1);
         this.n5.l6(1);
         this.n5.l6('\t');
      }
   }

   public n5(t4 var1, boolean var2) {
      this(var1, j5.z3(), var2);
   }

   public final k3 n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5.l6(true);
      this.l6(var1);
   }

   public final void l6() {
      this.n5.s7();
      this.n5.n5();
      this.n5.u9();
   }

   public final void l6(String var1) {
      this.n5.y4(var1);
   }

   public final void k5() {
      this.n5.s7();
   }

   public final void k5(String var1) {
      this.n5.c8(var1);
   }

   public final void n5(String var1, String var2) {
      this.l6(var1);
      this.u3(var2);
      this.k5();
   }

   public final void l6(String var1, String var2) {
      if (com.aspose.slides.internal.n2d.t4.l6(var2)) {
         this.n5(var1, var2);
      }
   }

   public final void n5(String var1, com.aspose.slides.ms.System.j5 var2) {
      if (var2.e2() > 1) {
         this.n5(var1, com.aspose.slides.internal.t6j.u3.n5(var2.m3()));
      }
   }

   public final void u3(String var1) {
      this.n5.l6(this.a6(var1));
   }

   public final void k5(String var1, String var2) {
      this.n5.u3(var1, this.a6(var2));
   }

   public final void n5(t4 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.e2.class);
      if (var2 != null) {
         this.n5(var2.toArray(), 0, (int)var1.getLength());
      } else {
         this.n5(com.aspose.slides.internal.n2d.t4.l6(var1), 0, (int)var1.getLength());
      }
   }

   public final void n5(byte[] var1, int var2, int var3) {
      k5 var4 = new k5(var1, var2, var3);

      while (!var4.l6()) {
         this.u3(var4.n5());
         this.n5.h0("\r\n");
      }
   }

   public final String n5(String var1, boolean var2) {
      if (!u9(var1)) {
         return var1;
      }

      this.l6.n5(0);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         boolean var4 = t9.a6(var1.charAt(var3));
         int var5 = var1.charAt(var3);
         if (var4) {
            var5 = t9.n5(var1.charAt(var3), var1.charAt(var3 + 1));
         }

         if (n5(var5)) {
            this.l6.n5(var1.charAt(var3));
            if (var4) {
               this.l6.n5(var1.charAt(++var3));
            }
         } else if (var2) {
            this.l6.n5(" ");
         }
      }

      return this.l6.toString();
   }

   public final String a6(String var1) {
      return this.n5(var1, false);
   }

   private static boolean u9(String var0) {
      if (!com.aspose.slides.internal.n2d.t4.l6(var0)) {
         return false;
      }

      for (int var1 = 0; var1 < var0.length(); var1++) {
         int var2 = var0.charAt(var1);
         if (t9.a6(var0.charAt(var1))) {
            var2 = t9.n5(var0.charAt(var1), var0.charAt(var1 + 1));
         }

         if (!n5(var2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean n5(int var0) {
      return var0 == 9 || var0 == 10 || var0 == 13 || var0 >= 32 && var0 <= 55295 || var0 >= 57344 && var0 <= 65533 || var0 >= 65536 && var0 <= 1114111;
   }
}
