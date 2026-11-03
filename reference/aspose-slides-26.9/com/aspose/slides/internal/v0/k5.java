package com.aspose.slides.internal.v0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.e1x.u6;

public class k5 extends t4 {
   private com.aspose.slides.internal.p1s.l6 l6;
   private float k5;
   private String u3;

   public k5(com.aspose.slides.internal.p1s.l6 var1, String var2) {
      this.l6 = var1;
      this.k5 = this.l6.n5().t2() / 1000.0F;
      this.u3 = var2;
   }

   @Override
   public String n5() {
      return "";
   }

   @Override
   public int n5(int var1) {
      return this.l6.n5().h0().l6(var1).n5();
   }

   @Override
   public boolean n5(char var1) {
      return this.l6.n5().h0().n5(var1) != null;
   }

   @Override
   public String l6() {
      return this.u3;
   }

   @Override
   public String k5() {
      return this.l6.n5().u3();
   }

   @Override
   public int l6(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6.n5().s7() * var1 / this.k5, 13);
   }

   @Override
   public int k5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6.n5().z8() * var1 / this.k5, 13);
   }

   @Override
   public int u3(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(-this.l6.n5().x8() * var1 / this.k5, 13);
   }

   @Override
   public int a6(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6.n5().j5() * var1 / this.k5, 13);
   }

   @Override
   public int n5(int var1, int var2) {
      u6 var3 = this.l6.n5().h0().l6((char)var1);
      float var4 = var3.k5() * var2;
      var4 /= this.k5;
      return com.aspose.slides.internal.v6g.k5.u3(var4, 13);
   }

   @Override
   public boolean u3() {
      return false;
   }

   @Override
   public Dictionary<Integer, Dictionary<Integer, Integer>> a6() {
      throw new NotImplementedException();
   }
}
