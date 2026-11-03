package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.Exception;

public final class h6 {
   private c3 n5;
   private Dictionary<String, s7> l6 = new Dictionary<>();
   private com.aspose.slides.internal.x1.u9 k5;
   private t1 u3;
   private z6 a6;

   public h6(int var1, String var2) {
      this.n5 = new c3(var1, var2);
      this.u3 = new t1(com.aspose.slides.internal.v6g.k5.u3(var1, 8));
      this.a6 = new z6(com.aspose.slides.internal.v6g.k5.u3(var1, 8), var2);
   }

   public h6(byte[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1);

      try {
         com.aspose.slides.internal.x1.x8 var3 = l6(var2);
         this.n5(var3);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public h6(com.aspose.slides.internal.x1.x8 var1) {
      this.n5(var1);
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.x1.x8 var2 = new com.aspose.slides.internal.x1.x8();
      this.k5(var2);
      this.a6(var2);
      this.h0(var2);
      this.t2(var2);
      this.x8(var2);
      var2.l6(var1);
   }

   public byte[] n5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         this.n5(var1);
         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public c3 l6() {
      return this.n5;
   }

   public w1 n5(String var1) {
      w1 var2 = this.n5.n5(var1);
      this.a6.n5().l6(var1);
      this.u3.n5(var1);
      return var2;
   }

   public void n5(String var1, String var2) {
      this.n5.n5(var1, var2);
   }

   public void l6(String var1) {
      this.n5.l6(var1);
      this.a6.n5().k5(var1);
      this.u3.l6(var1);
   }

   public final boolean k5() {
      return this.a6.n5().n5();
   }

   private void n5(com.aspose.slides.internal.x1.x8 var1) {
      this.l6(var1);
      this.u3(var1);
      this.u9(var1);
      this.c8(var1);
      this.s7(var1);
   }

   private static com.aspose.slides.internal.x1.x8 l6(com.aspose.slides.internal.z0k.t4 var0) {
      try {
         return new com.aspose.slides.internal.x1.x8(var0);
      } catch (com.aspose.slides.internal.x1.u3 var3) {
         throw new d1("Can't read VBA project", var3);
      } catch (RuntimeException var4) {
         throw new d1("Can't read VBA project.", new Exception(var4.getCause()));
      }
   }

   private void l6(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.c8 var2 = var1.n5().u3("VBA");
      com.aspose.slides.internal.x1.t2 var3 = var2 instanceof com.aspose.slides.internal.x1.t2 ? (com.aspose.slides.internal.x1.t2)var2 : null;
      if (var3 == null) {
         throw new d1("Can't read VBA project");
      }

      this.n5 = new c3(var3);
   }

   private void k5(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.t2 var2 = new com.aspose.slides.internal.x1.t2("VBA");
      this.n5.n5(var2);
      if (!var1.n5().a6(var2)) {
      }
   }

   private void u3(com.aspose.slides.internal.x1.x8 var1) {
      for (e2 var3 : this.n5.n5().k5().l6()) {
         if (var3.k5().n5() == 34) {
            com.aspose.slides.internal.x1.c8 var4 = var1.n5().u3(var3.n5().l6());
            com.aspose.slides.internal.x1.t2 var5 = var4 instanceof com.aspose.slides.internal.x1.t2 ? (com.aspose.slides.internal.x1.t2)var4 : null;
            if (var5 != null) {
               s7 var6 = new s7(var5, this.n5.n5().n5().n5().l6());
               this.l6.addItem(var3.n5().l6(), var6);
            }
         }
      }
   }

   private void a6(com.aspose.slides.internal.x1.x8 var1) {
      for (KeyValuePair var3 : this.l6) {
         ((s7)var3.getValue()).n5(var1.n5());
      }
   }

   private void u9(com.aspose.slides.internal.x1.x8 var1) {
      if (var1.n5().u3("PROJECT") == null) {
         throw new d1("Can't read VBA project");
      }

      com.aspose.slides.internal.x1.c8 var2 = var1.n5().u3("PROJECT");
      com.aspose.slides.internal.x1.u9 var3 = var2 instanceof com.aspose.slides.internal.x1.u9 ? (com.aspose.slides.internal.x1.u9)var2 : null;
      this.a6 = new z6(var3, this.n5.n5().n5().n5().l6());
   }

   private void h0(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("PROJECT");
      this.a6.n5(var2);
      if (!var1.n5().a6(var2)) {
      }
   }

   private void c8(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.c8 var2 = var1.n5().u3("PROJECTlk");
      this.k5 = var2 instanceof com.aspose.slides.internal.x1.u9 ? (com.aspose.slides.internal.x1.u9)var2 : null;
   }

   private void t2(com.aspose.slides.internal.x1.x8 var1) {
      if (this.k5 != null) {
         if (!var1.n5().a6(this.k5)) {
         }
      }
   }

   private void s7(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.c8 var2 = var1.n5().u3("PROJECTwm");
      com.aspose.slides.internal.x1.u9 var3 = var2 instanceof com.aspose.slides.internal.x1.u9 ? (com.aspose.slides.internal.x1.u9)var2 : null;
      if (var3 != null) {
         this.u3 = new t1(var3, this.n5.n5().n5().n5().l6());
      }
   }

   private void x8(com.aspose.slides.internal.x1.x8 var1) {
      if (this.u3 != null) {
         com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("PROJECTwm");
         this.u3.n5(var2);
         if (!var1.n5().a6(var2)) {
         }
      }
   }
}
