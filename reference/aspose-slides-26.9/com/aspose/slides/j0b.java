package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class j0b extends e8v {
   private List<j0b$n5> s7;
   private List<com.aspose.slides.internal.x4g.s7> x8;
   private List<com.aspose.slides.internal.o9b.y1> n3;
   private List<TextParam> y4;

   public j0b(int var1, int var2, float var3, float var4) {
      super(var1, var2, var3, var4);
      this.n5(new com.aspose.slides.internal.w0.c8());
      this.x8 = new List<>();
      this.n3 = new List<>();
      this.y4 = new List<>();
      this.s7 = new List<>();
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
      a1v var4 = null;
      if (var3 != null && var3.u3() != 0) {
         var4 = var3.s7();
      }

      l6v var5 = null;
      if (var2 != null && var2.u9()) {
         var5 = var2.w1();
      }

      if (var1 != null && var1.h0() > 0 && (var4 != null || var2 != null)) {
         com.aspose.slides.internal.x4g.s7 var6 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
         if (this.c8 != null) {
            var6.l6(com.aspose.slides.internal.n8e.n1.l6(this.c8));
         }

         if (var2 != null) {
            boolean var7 = var2.s7() == 0 && var2.x8() == 0 || this.n5(var1);
            if (!var7) {
               com.aspose.slides.internal.x4g.s7 var8 = null;
               com.aspose.slides.internal.x4g.s7 var9 = null;
               com.aspose.slides.internal.x4g.s7[] var10 = new com.aspose.slides.internal.x4g.s7[]{var8};
               com.aspose.slides.internal.x4g.s7[] var11 = new com.aspose.slides.internal.x4g.s7[]{var9};
               com.aspose.slides.internal.x4g.s7 var12 = n5(var1, var2, var10, var11);
               var8 = var10[0];
               var9 = var11[0];
               var5.u3((byte)0);
               var5.a6((byte)0);
               if (var8 != null) {
                  this.s7.addItem(new j0b$n5(var8, var5.z3(), null));
               }

               if (var9 != null) {
                  this.s7.addItem(new j0b$n5(var9, var5.z3(), null));
               }

               if (var12 != null) {
                  this.s7.addItem(new j0b$n5(var12, null, var5));
               }

               return;
            }
         }

         this.s7.addItem(new j0b$n5(var6, var4, var5));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      com.aspose.slides.internal.o9b.n3 var4 = var3.d2().n5();
      int var5 = var4.x8();
      com.aspose.slides.internal.o9b.y4 var6 = var4.l6();
      float var7 = var3.t4();
      float var8 = (float)var6.k5(var5) / var6.h0(var5) * var4.n5(this.l6);
      var2.u3(var2.n3() - (var8 + var7 * var3.k5() / 100.0F));
      if (var3.k5() != 0) {
         var7 *= 0.66F;
      }

      com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();
      var9.n5(var1, var4.l6(), var5, var7, var2.u9().u3(), this.a6);
      if (this.c8 != null) {
         var9.l6(com.aspose.slides.internal.n8e.n1.l6(this.c8));
         this.c8.n5(var2.y4()).a6(var2);
      }

      this.x8.addItem(var9);
      this.n3.addItem(var2.y4());
      this.y4.addItem(var3);
      this.s7.addItem(new j0b$n5(var9, var3.u3(), var3.a6()));
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
      throw new NotImplementedException();
   }

   public final List<com.aspose.slides.internal.x4g.s7> n5() {
      return this.x8;
   }

   public final List<com.aspose.slides.internal.o9b.y1> l6() {
      return this.n3;
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return new com.aspose.slides.internal.o9b.y1();
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
   }

   public final List<TextParam> k5() {
      return this.y4;
   }

   public final j0b$n5[] y4() {
      return this.s7.toArray(new j0b$n5[0]);
   }
}
