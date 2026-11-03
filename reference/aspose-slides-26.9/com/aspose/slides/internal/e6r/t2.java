package com.aspose.slides.internal.e6r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;

public class t2 extends a0 {
   private final h0 n5;
   private final u9 k5;
   private final List<c8> u3;
   private final c8 a6;

   public t2(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
      this.n5 = new h0(var1);
      this.k5 = new u9(var1);
      this.u3 = new List<>();
      this.a6 = new c8(var1, "/Presentation", this.t2(), null);
      this.u3.addItem(this.a6);
   }

   public final u9 n5() {
      return this.k5;
   }

   public final c8 l6() {
      return this.a6;
   }

   public final c8 a6(String var1) {
      return this.a6.t2(var1);
   }

   public final int z1() {
      return this.k5.l6();
   }

   public final int u9(String var1) {
      return this.k5.a6(var1);
   }

   public final int n5(int var1, String var2) {
      return this.k5.n5(var1, var2);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/StructTreeRoot");
      var1.k5("/RoleMap", this.n5.t2());
      var1.k5("/ParentTree", this.k5.t2());
      var1.n5("/ParentTreeNextKey", this.k5.n5());
      this.k5(var1);
      var1.t2();
      var1.l6();
      this.n5.n5(var1);
      this.k5.n5(var1);

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         this.u3.get_Item(var2).n5(var1);
      }
   }

   private void k5(t4 var1) {
      var1.n5("/K");
      var1.n5("[");

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         var1.n5(this.u3.get_Item(var2).t2());
         var1.u9();
      }

      var1.n5("]");
   }
}
