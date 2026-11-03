package com.aspose.slides.internal.v1y;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

class a6 implements com.aspose.slides.internal.t9z.k5 {
   private List<GeneralPath> n5 = new ArrayList<>();
   private List<List<com.aspose.slides.internal.e3j.a6>> l6 = new ArrayList<>();
   private List<Boolean> k5 = new ArrayList<>();
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private GeneralPath c8;

   public List<com.aspose.slides.internal.x4g.s7> k5() {
      ArrayList var1 = new ArrayList(this.n5.size());

      for (GeneralPath var3 : this.n5) {
         var1.add(com.aspose.slides.internal.x4g.s7.n5((Object)(var3)));
      }

      return var1;
   }

   public List<List<com.aspose.slides.internal.e3j.a6>> u3() {
      return this.l6;
   }

   public List<Boolean> a6() {
      return this.k5;
   }

   private GeneralPath u9() {
      if (this.c8 == null) {
         this.k5(this.u3, this.a6);
      }

      return this.c8;
   }

   private void h0() {
      this.k5.set(this.k5.size() - 1, true);
      this.c8 = null;
   }

   private void k5(float var1, float var2) {
      GeneralPath var3 = new GeneralPath();
      var3.moveTo(var1, var2);
      this.n5.add(var3);
      this.l6.add(new ArrayList<>());
      this.k5.add(false);
      this.c8 = var3;
      this.u3 = var1;
      this.a6 = var2;
      this.u9 = var1;
      this.h0 = var2;
   }

   @Override
   public void n5(float var1, float var2) {
      this.k5(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.u9().lineTo(var1, var2);
      this.l6.get(this.l6.size() - 1).add(new com.aspose.slides.internal.e3j.a6(this.u9, this.h0, var1, var2));
      this.u9 = var1;
      this.h0 = var2;
      if (var1 == this.u3 && var2 == this.a6) {
         this.h0();
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.u9().quadTo(var1, var2, var3, var4);
      this.u9 = var3;
      this.h0 = var4;
      if (var3 == this.u3 && var4 == this.a6) {
         this.h0();
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.u9().curveTo(var1, var2, var3, var4, var5, var6);
      this.u9 = var5;
      this.h0 = var6;
      if (var5 == this.u3 && var6 == this.a6) {
         this.h0();
      }
   }

   @Override
   public void n5() {
      if (this.c8 == null) {
         if (!this.n5.isEmpty()) {
            this.n5.get(this.n5.size() - 1).closePath();
            this.l6.get(this.l6.size() - 1).add(new com.aspose.slides.internal.e3j.a6(this.u9, this.h0, this.u3, this.a6));
         }
      } else {
         this.u9().closePath();
         this.l6.get(this.l6.size() - 1).add(new com.aspose.slides.internal.e3j.a6(this.u9, this.h0, this.u3, this.a6));
         this.h0();
      }
   }

   @Override
   public void l6() {
   }
}
