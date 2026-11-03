package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class v0 implements IGenericEnumerable<h2> {
   private int n5;
   private int l6;
   private final List<h2> k5 = new List<>();
   private final float u3;

   public v0() {
      this(1.0F);
   }

   public v0(float var1) {
      this.u3 = var1;
   }

   public final h2 n5(int var1) {
      return var1 >= 0 && var1 < this.k5.size() ? this.k5.get_Item(var1) : null;
   }

   public final void n5(int var1, int var2, boolean var3, boolean var4) {
      int var5 = com.aspose.slides.internal.n2d.t2.t2(var1 * this.u3);
      int var6 = com.aspose.slides.internal.n2d.t2.t2(var2 * this.u3);
      this.n5 += var5;
      this.l6 += var6;
      h2 var7 = new h2(var5, var6, this.n5, this.l6, var3, var4);
      if (this.l6() == null || !this.l6().u3() || !var7.u3()) {
         this.k5.addItem(var7);
      }
   }

   public final int n5() {
      return this.k5.size();
   }

   private h2 l6() {
      return this.n5(this.k5.size() - 1);
   }

   public final void n5(int var1, int var2) {
      this.n5 = com.aspose.slides.internal.n2d.t2.t2(var1 * this.u3);
      this.l6 = com.aspose.slides.internal.n2d.t2.t2(var2 * this.u3);
   }

   @Override
   public final IGenericEnumerator<h2> iterator() {
      return this.k5.iterator();
   }
}
