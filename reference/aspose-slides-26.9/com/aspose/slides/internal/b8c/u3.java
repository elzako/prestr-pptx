package com.aspose.slides.internal.b8c;

public class u3 extends c8 {
   public u3(com.aspose.slides.ms.System.Xml.s8 var1, v2 var2, com.aspose.slides.ms.System.Xml.v0 var3) {
      super(var1, var2, var3);
      this.n5 = new x0();
   }

   @Override
   public boolean n5() {
      return false;
   }

   @Override
   public void l6() {
      int var1 = this.t9();
      switch (var1) {
         case 1:
         case 2:
         default:
            break;
         case 3:
            this.l6.n5(new w0(this));
            this.l6.h2().l6();
            break;
         case 4:
            this.l6.n5(new n9a(this));
            this.l6.h2().l6();
      }
   }

   @Override
   public void k5() {
   }

   @Override
   public Object n5(String var1) {
      return null;
   }

   private int t9() {
      if (this.l6.t1() != null && this.l6.t1().size() > 0) {
         j0 var1 = this.l6.t1().l6();

         while (var1.hasNext()) {
            u1 var2 = var1.n5();
            x0 var3 = var2.n5();
            if (var3.x8() == 3) {
               return 4;
            }

            if (var3.x8() == 2) {
               return 3;
            }
         }
      }

      if (this.l6.s7() == 1) {
         int var6 = this.h0().n5(this.l6.n3(), this.l6.y4());
         if (var6 == 3) {
            return 4;
         }

         if (var6 == 2) {
            return 3;
         }

         int var7 = this.l6.z8();

         for (int var8 = 0; var8 < var7; var8++) {
            this.l6.l6(var8);
            String var4 = this.l6.y4();
            String var5 = this.l6.n3();
            if (com.aspose.slides.ms.System.Xml.v8.n5(var4, this.h0().a6)) {
               if (i8.l6(this.l6.z1())) {
                  this.l6.a6();
                  return 3;
               }
            } else {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var4, this.h0().t2)) {
                  this.l6.a6();
                  return 4;
               }

               if (com.aspose.slides.ms.System.Xml.v8.n5(var4, this.h0().z3.n5()) && com.aspose.slides.ms.System.Xml.v8.n5(var5, this.h0().z3.l6())) {
                  this.l6.n5(v5.l6(this.l6.z1()));
                  this.l6.a6();
                  return 3;
               }
            }
         }

         if (var7 > 0) {
            this.l6.a6();
         }
      }

      return 1;
   }
}
