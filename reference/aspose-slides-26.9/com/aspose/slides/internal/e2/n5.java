package com.aspose.slides.internal.e2;

import com.aspose.slides.internal.h0.h0;
import com.aspose.slides.internal.l6.n3;
import com.aspose.slides.internal.l6.u3;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n5.t2;
import com.aspose.slides.internal.n5.u9;
import com.aspose.slides.internal.r7c.c8;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 extends t2 {
   private static final c8 y4 = new c8("\\\\([\\n\\r\\f0-9a-fA-F]{1,6})\\s*");
   private String e2;
   private l6$u3 t9;

   public n5(u9 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   public n5(int var1, l6$u3 var2) {
      super(var1);
      this.t9 = new l6$u3(var2);
   }

   public n5(int var1, l6$u3 var2, int var3, int var4) {
      super(var1);
      this.t9 = new l6$u3(var2);
      this.c8 = var3;
      this.t2 = var4;
   }

   public final n5 n5(l6$u3 var1) {
      this.t9 = var1;
      return this;
   }

   public final l6$u3 c8() {
      return this.t9;
   }

   public static String n5(n3 var0) {
      return d1.k5(((n5)((u3)var0).n3()).t2(), 1);
   }

   public static String l6(n3 var0) {
      return d1.k5(((n5)((u3)var0).n3()).t2(), 1);
   }

   public static String k5(n3 var0) {
      return ((n5)((u3)var0).n3()).t2();
   }

   public final String t2() {
      if (this.e2 == null && this.l6() != null) {
         String var1 = this.l6();
         if (d1.u3(var1, '\\') != -1) {
            var1 = y4.n5(var1, new n5$1(this));
         }

         if (d1.u3(var1, '\\') != -1) {
            var1 = d1.n5(var1, "\\", d1.n5);
         }

         this.e2 = var1;
      }

      return this.e2;
   }

   private static String l6(com.aspose.slides.internal.r7c.u3 var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = a3.n5(d1.k5(var0.k5(), 1), 515, com.aspose.slides.internal.h0.h0.n5, var2);
      var1 = var2[0];
      return var3 ? d1.n5((char)var1, 1) : d1.n5;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("/").n5(this.t9).n5("/").n5(super.toString());
      return var1.toString();
   }

   // $VF: synthetic method
   static String n5(com.aspose.slides.internal.r7c.u3 var0) {
      return l6(var0);
   }
}
