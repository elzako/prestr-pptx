package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;

public class t4$n5 {
   private List<Float> n5 = new List<>();
   private List<Float> l6 = new List<>();
   private List<Float> k5 = new List<>();
   private List<t4$l6> u3 = new List<>();
   private List<Byte> a6 = new List<>();

   public final List<t4$l6> n5() {
      return this.u3;
   }

   public final List<Float> l6() {
      return this.n5;
   }

   public final List<Float> k5() {
      return this.l6;
   }

   public final List<Float> u3() {
      return this.k5;
   }

   public final List<Byte> a6() {
      return this.a6;
   }

   public final void n5(float var1) {
      this.n5(null, var1, 0.0F, 0.0F);
   }

   public final void n5(t4$l6 var1, float var2, float var3, float var4) {
      byte var5 = 0;
      if (var2 > 0.0F) {
         this.n5.addItem(var2);
         var5 = (byte)(var5 & 0xFF | 1);
      }

      if (var3 != 0.0F) {
         this.l6.addItem(var3);
         var5 = (byte)(var5 & 0xFF | 2);
      }

      if (var4 != 0.0F) {
         this.k5.addItem(var4);
         var5 = (byte)(var5 & 0xFF | 4);
      }

      if (var1 != null) {
         this.u3.addItem(var1);
         var5 = (byte)(var5 & 0xFF | 8);
      }

      this.a6.addItem(var5);
   }

   public final t4 u9() {
      return new t4(this, null);
   }
}
