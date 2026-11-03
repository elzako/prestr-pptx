package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;

public class u6 extends j4 {
   protected String n5;
   private a1 u3;
   private IGenericList<String> a6 = new List<>();
   private y9 u9;

   public final String n3() {
      return this.n5;
   }

   public final void h0(String var1) {
      this.n5 = var1;
   }

   public final a1 y4() {
      return this.u3;
   }

   public final void n5(a1 var1) {
      this.u3 = var1;
   }

   public final IGenericList<String> e2() {
      return this.a6;
   }

   public final void n5(IGenericList<String> var1) {
      this.a6 = var1;
   }

   public final y9 t9() {
      return this.u9;
   }

   public final void n5(y9 var1) {
      this.u9 = var1;
   }

   @Override
   public int k5() {
      return this.e2().size();
   }

   @Override
   public void n5(int var1) {
   }

   public final j4 z1() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5("prototype"), j4.class);
   }

   public final void n5(j4 var1) {
      this.n5("prototype", var1);
   }

   public boolean l6(j4 var1) {
      return var1 != null && var1 != y5.n5 && var1 != y5.n5 ? this.z1().n5(var1) : false;
   }

   public j4 n5(g7[] var1, com.aspose.slides.ms.System.y8[] var2, w2 var3) {
      j4 var4 = var3.u3().n3().k5(this.z1());
      var3.n5(this, var4, var1);
      return com.aspose.slides.internal.v6g.k5.n5(var3.t2(), j4.class) != null ? com.aspose.slides.internal.v6g.k5.n5(var3.t2(), j4.class) : var4;
   }

   @Override
   public Object C_() {
      return null;
   }

   @Override
   public void n5(Object var1) {
   }

   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      this.y4().n5((j8)var1);
      return var2;
   }

   @Override
   public String u3() {
      return "Function";
   }

   @Override
   public boolean n5() {
      return true;
   }

   @Override
   public double l6() {
      return 1.0;
   }

   public u6(j9 var1) {
      this(var1.y4().z1());
   }

   public u6(j4 var1) {
      super(var1);
      this.n5(new d5());
      this.n5("prototype", y5.n5, 2);
   }
}
