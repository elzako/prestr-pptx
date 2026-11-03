package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class t1z extends c5q {
   protected p6w l6;
   protected f1c k5 = null;
   protected f1c u3;
   protected f1c a6 = null;
   protected List<z0k> u9 = new List<>();

   public t1z(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final f1c k5() {
      return this.k5;
   }

   public final f1c u3() {
      return this.u3;
   }

   public final f1c a6() {
      return this.a6;
   }

   public final z0k n5(int var1) {
      return this.u9.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      int var3 = var1.n3() & 65535;
      int var4 = var1.n3() & 65535;
      int var5 = var1.n3() & 65535;
      List var6 = l6(var1);
      this.l6 = f1s.n5(new p6w(this.n5 & 4294967295L, var2), var1);
      if (var3 != 0) {
         this.k5 = f1s.n5(new f1c(this.n5 & 4294967295L, var3), var1);
      }

      this.u3 = f1s.n5(new f1c(this.n5 & 4294967295L, var4), var1);
      if (var5 != 0) {
         this.a6 = f1s.n5(new f1c(this.n5 & 4294967295L, var5), var1);
      }

      for (int var7 = 0; var7 < var6.size(); var7++) {
         int var8 = (Integer)var6.get_Item(var7);
         if ((var8 & 65535) == 0) {
            this.u9.addItem(null);
         } else {
            this.u9.addItem(f1s.n5(new z0k((this.n5 & 4294967295L) + (var8 & 65535) & 4294967295L), var1));
         }
      }
   }
}
