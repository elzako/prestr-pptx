package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class x8 extends k5 implements IDisposable {
   private final List<com.aspose.slides.internal.v1.u9> n5;
   private final t4 l6;
   private t4 k5;

   public x8(k5 var1, t4 var2) {
      super(var1);
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      com.aspose.slides.internal.f8y.n5.n5(var2 != null);
      this.l6 = var2;
      this.n5 = new List<>();
   }

   public t4 u3() {
      if (this.k5 == null) {
         List var1 = this.h0();
         this.n5.addRange(var1);
      }

      com.aspose.slides.internal.f8y.n5.n5(this.k5 != null);
      short var3 = 2048;
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      this.k5.seek(0L, 0);
      com.aspose.slides.internal.d4.l6.n5(this.k5, var2, 2048);
      return var2;
   }

   public s7 a6() {
      return this.u9(c8.b2);
   }

   private List<com.aspose.slides.internal.v1.u9> h0() {
      this.k5 = new com.aspose.slides.internal.z0k.e2();
      this.l6.seek(0L, 0);
      com.aspose.slides.internal.q7.n5.n5(this.l6, this.k5);
      s7 var1 = this.a6();
      List var2 = new List();
      if (var1 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, c8.class)) {
            com.aspose.slides.internal.v1.u9 var3 = this.l6((c8)var1, 0);
            var2.addItem(var3);
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, n5.class)) {
               String var5 = d1.n5("Unknown filter type is encountered: {0}", new Object[]{var1});
               throw new IOException(var5);
            }

            List var4 = this.n5((n5)var1);
            var2.addRange(var4);
         }
      }

      return var2;
   }

   private List<com.aspose.slides.internal.v1.u9> n5(n5 var1) {
      if (var1.n5() > 1) {
         int var2 = this.l6(var1);
         if (var2 != -1) {
            return this.n5(var1, var2);
         }
      }

      return this.n5(var1, 0);
   }

   private com.aspose.slides.internal.v1.u9 l6(c8 var1, int var2) {
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      com.aspose.slides.internal.v1.h0 var3 = new com.aspose.slides.internal.v1.h0();
      com.aspose.slides.internal.v1.t2 var4 = var3.n5(var1);
      if (this.k5 != null) {
         this.k5.dispose();
      }

      this.k5 = new com.aspose.slides.internal.z0k.e2();
      this.l6.seek(0L, 0);
      return var4.n5(this.l6, this.k5, this, var2);
   }

   private int l6(n5 var1) {
      for (int var2 = 0; var2 < var1.n5(); var2++) {
         if ((c8)var1.k5(var2) == c8.u5) {
            return var2;
         }
      }

      return -1;
   }

   private List<com.aspose.slides.internal.v1.u9> n5(n5 var1, int var2) {
      List var3 = new List();
      if (var2 >= 0 && var2 < var1.n5()) {
         com.aspose.slides.internal.v1.u9 var4 = this.l6((c8)var1.k5(var2), var2);
         var3.addItem(var4);
      }

      for (int var7 = 0; var7 < var1.n5(); var7++) {
         if (var7 != var2) {
            c8 var5 = (c8)var1.k5(var7);
            com.aspose.slides.internal.v1.u9 var6 = this.l6(var5, var7);
            var3.addItem(var6);
         }
      }

      return var3;
   }

   public final com.aspose.slides.internal.v1.u9 u9() {
      return this.n5.size() < 1 ? com.aspose.slides.internal.v1.u9.n5() : this.n5.get_Item(this.n5.size() - 1);
   }

   @Override
   public final void dispose() {
      if (this.k5 != null) {
         this.k5.dispose();
         this.k5 = null;
      }
   }
}
