package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class j9e extends d8 {
   private String n5;
   private int l6 = 256;
   private int k5;
   private j9e u3;
   private v5 a6;
   private int u9;
   private volatile t6 h0;
   private volatile com.aspose.slides.ms.System.Xml.k6 c8 = com.aspose.slides.ms.System.Xml.k6.n5;
   private j9e t2;
   private int s7;

   public static u1s k5(int var0) {
      return t4.k5(var0);
   }

   public static l9 n5(com.aspose.slides.ms.System.Xml.k6 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("qualifiedName");
      } else if (var0.equals(l9.n5().r4())) {
         return l9.n5();
      } else {
         return var0.equals(l9.l6().r4()) ? l9.l6() : null;
      }
   }

   public final String j5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final int w1() {
      return this.l6;
   }

   public final void u3(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 r4() {
      return this.c8;
   }

   public final int c4() {
      return this.u9;
   }

   public final j9e y1() {
      return this.u3;
   }

   public final int a0() {
      return this.k5;
   }

   public final v5 b3() {
      return this.a6;
   }

   public boolean s7() {
      return false;
   }

   public void l6(boolean var1) {
   }

   public final int o0() {
      if (this == l9.n5()) {
         return 1;
      } else {
         return this.a6 == null ? 0 : this.a6.n3();
      }
   }

   public final e3m z7() {
      return this.a6 == null ? p6t.n5 : this.a6.c8();
   }

   public final int v4() {
      return this.s7;
   }

   public final void l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.c8 = var1;
   }

   public final void a6(int var1) {
      this.u9 = var1;
   }

   public final void n5(j9e var1) {
      this.u3 = var1;
   }

   public final void c8(int var1) {
      this.k5 = var1;
   }

   public final void n5(v5 var1) {
      this.a6 = var1;
   }

   public final t6 u6() {
      return this.h0;
   }

   public final void n5(t6 var1) {
      this.h0 = var1;
   }

   public final j9e t1() {
      return this.t2;
   }

   public final void l6(j9e var1) {
      this.t2 = var1;
   }

   public final void t2(int var1) {
      this.s7 = var1;
   }

   public static boolean n5(j9e var0, j9e var1, int var2) {
      if (var0 != null && var1 != null) {
         if (var0 == var1) {
            return true;
         }

         if (var1 == l9.n5()) {
            return true;
         }

         do {
            u1s var3 = com.aspose.slides.internal.v6g.k5.n5(var0, u1s.class);
            u1s var4 = com.aspose.slides.internal.v6g.k5.n5(var1, u1s.class);
            if (var4 != null && var3 != null) {
               if (var4 == t4.n5()) {
                  return true;
               }

               if ((var2 & var0.a0()) == 0 && var3.b3().n5(var4.b3())) {
                  return true;
               }

               return false;
            }

            if ((var2 & var0.a0()) != 0) {
               return false;
            }

            var0 = var0.y1();
            if (var0 == var1) {
               return true;
            }
         } while (var0 != null);

         return false;
      } else {
         return false;
      }
   }

   public static boolean n5(v5 var0, v5 var1, int var2) {
      return t4.n5().b3() == var1 ? true : var0.n5(var1);
   }

   @Override
   public String ae_() {
      return this.j5();
   }

   @Override
   public void u9(String var1) {
      this.l6(var1);
   }
}
