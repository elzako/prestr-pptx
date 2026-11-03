package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class q7 extends e6r {
   private b8 n5 = new b8();
   private final List<x6> l6 = new List<>();

   public q7() {
      super(61446, (byte)0);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);

      for (int var2 = 1; var2 < (this.n5.l6() & 4294967295L); var2++) {
         this.l6.addItem(new x6(var1));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.l6((this.l6.size() & 4294967295L) + 1L & 4294967295L);
      this.n5.n5(var1);

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         this.l6.get_Item(var2).n5(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = this.n5.a6();

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         x6 var3 = this.l6.get_Item(var2);
         var1 += var3.l6();
      }

      return var1;
   }

   public final void n5(long var1) {
      this.n5.n5(var1);
   }

   public final long l6() {
      return this.n5.k5();
   }

   public final void l6(long var1) {
      this.n5.k5(var1);
   }

   public final long k5() {
      return this.n5.u3();
   }

   public final void k5(long var1) {
      this.n5.u3(var1);
   }

   public final List<x6> u3() {
      return this.l6;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("{0}\n",new Object[]{ super.toString()});
      var1.n5("SpidMax:{0}, FidclCount:{1}, CspSaved:{2}, CdgSaved:{3}\n",new Object[]{ this.n5.n5(), this.l6.size(), this.n5.k5(), this.n5.u3()});

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         var1.n5("{0}\n",new Object[]{ this.l6.get_Item(var2)});
      }

      return var1.toString();
   }
}
