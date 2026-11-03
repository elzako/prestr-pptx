package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

public class d2a {
   private int n5;
   private boolean l6;
   private r4 k5;
   private List<r5w> u3;
   private r5w a6 = null;
   private w1n u9;
   private short h0 = 0;

   private void n5(r4 var1) {
      this.k5 = var1;
      switch (this.k5.w1().u3()) {
         case 4080:
            this.n5 = 0;
            this.l6 = true;
            break;
         default:
            this.n5 = 1;
            this.l6 = false;
      }
   }

   d2a(r4 var1) {
      this.n5(var1);
      this.u3 = new List<>();
   }

   d2a(r4 var1, List<r5w> var2) {
      this.n5(var1);
      List var3 = var2;
      if (var3 == null) {
         var3 = new List();
      }

      this.u3 = var3;
   }

   public final r5w n5() {
      return this.a6;
   }

   final r4 l6() {
      return this.k5;
   }

   public final r5w k5() {
      if (this.l6) {
         if (this.a6 == null || !this.a6.l6()) {
            this.a6 = new r5w(this);
            this.u3.addItem(this.a6);
         }
      } else if (this.u3.size() == 0) {
         this.a6 = new r5w(this);
         this.u3.addItem(this.a6);
      }

      return this.a6;
   }

   public final void n5(e6r var1) {
      this.n5(var1.w1().u3());
      if (com.aspose.slides.internal.v6g.k5.l6(var1, b1.class)) {
         if (this.a6 == null || !this.a6.n5(var1.w1().u3())) {
            this.k5();
         }

         this.a6.n5((b1)var1);
         this.l6(var1);
      }
   }

   private void l6(e6r var1) {
      if (var1 instanceof w1n) {
         this.h0 = 0;
         this.u9 = (w1n)var1;
      }

      if (var1 instanceof y8m) {
         var1.w1().n5(this.h0++);
      }
   }

   public final w1n u3() {
      return this.u9;
   }

   private void n5(int var1) {
      switch (this.n5) {
         case 0:
            switch (var1) {
               case 3998:
                  throw new Exception(
                     com.aspose.slides.ms.System.d1.n5(
                        "SlideListWithText can't contain {0} ({1})",new Object[]{
                        com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(n4.class), var1),
                        var1
                     })
                  );
               default:
                  return;
            }
         case 1:
            switch (var1) {
               case 1011:
                  throw new Exception(
                     com.aspose.slides.ms.System.d1.n5(
                        "ClientTextBox can't contain {0} ({1})",new Object[]{
                        com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(n4.class), var1),
                        var1
                     })
                  );
            }
      }
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1, int var2) {
      int var3 = 0;
      if (this.l6) {
         this.u3.clear();
         this.a6 = null;
      } else {
         this.a6.n5(true);
      }

      while (var3 + 4 < var2) {
         z6z var4 = new z6z(var1);
         e6r var5 = p5k.n5(var4, null, this.k5, var1);
         this.n5(var5);
         var5.n5(var1, var4);
         var3 += 8 + var5.w1().a6();
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         this.u3.get_Item(var2).n5(var1);
      }
   }

   public final int a6() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         var1 += this.u3.get_Item(var2).d5();
      }

      return var1;
   }

   public final List<w1n> u9() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         r5w var3 = this.u3.get_Item(var2);
         if (var3.k5()) {
            var1.addItem(var3.z3());
         }
      }

      return var1.size() > 0 ? var1 : null;
   }

   public final List<r5w> n5(long var1) {
      for (int var3 = 0; var3 < this.u3.size(); var3++) {
         r5w var4 = this.u3.get_Item(var3);
         if (var4.k5()) {
            w1n var5 = var4.z3();
            if (var5.l6() == var1) {
               List var6 = new List();
               var6.addItem(var4);
               int var7 = var5.k5();
               if (var7 > 1) {
                  for (int var8 = 1; var8 < var7; var8++) {
                     if (var3 + var8 < this.u3.size()) {
                        var6.addItem(this.u3.get_Item(var3 + var8));
                     }
                  }
               }

               return var6;
            }
         }
      }

      return null;
   }
}
