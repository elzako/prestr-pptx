package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public abstract class a6 extends u3 {
   private com.aspose.slides.internal.j5.n5 n5;
   private boolean l6;
   private boolean k5;

   protected a6(com.aspose.slides.internal.j5.n5 var1, String var2, boolean var3, boolean var4) {
      super(var2);
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var4;
   }

   protected final com.aspose.slides.internal.j5.n5 l6() {
      return this.n5;
   }

   protected final int n5(com.aspose.slides.internal.j3.z3 var1) {
      return this.l6 ? this.l6(var1) : this.k5(var1);
   }

   private int l6(com.aspose.slides.internal.j3.z3 var1) {
      String var2 = var1.a6();
      int var3 = 1;

      for (com.aspose.slides.internal.j3.z8 var4 = var1.v4(); var4 != null; var4 = var4.v4()) {
         if (var4.n3() == 1) {
            if (this.k5) {
               var3++;
            } else if (d1.a6(((com.aspose.slides.internal.j3.z3)var4).a6(), var2)) {
               var3++;
            }
         }
      }

      return var3;
   }

   private int k5(com.aspose.slides.internal.j3.z3 var1) {
      int var2 = 1;
      String var3 = var1.a6();

      for (com.aspose.slides.internal.j3.z8 var4 = var1.z7(); var4 != null; var4 = var4.z7()) {
         if (var4.n3() == 1) {
            if (this.k5) {
               var2++;
            } else if (d1.a6(((com.aspose.slides.internal.j3.z3)var4).a6(), var3)) {
               var2++;
            }
         }
      }

      return var2;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      return var1.a5() != null && var1.a5().n3() == 1 ? this.l6().n5(this.n5(var1)) : false;
   }

   @Override
   public String a6() {
      return d1.n5(':', this.n5(), this.n5.n5(), ")");
   }
}
