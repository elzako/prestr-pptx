package com.aspose.slides.internal.k4y;

class o4z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o4z l6;

   o4z$1(o4z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o4z.k5().n5(this.n5.n3())) {
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
            this.n5.r4();
            return false;
         case 12:
            this.n5.u9();
            o4z.n5(this.l6, new g7("i4", com.aspose.slides.ms.System.a3.n5(this.n5.z1())));
            break;
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            this.n5.r4();
            return false;
         case 20:
            this.n5.u9();
            o4z.n5(this.l6, new g7("r4", com.aspose.slides.ms.System.Xml.f4.m1(this.n5.z1())));
            break;
         case 21:
            this.n5.u9();
            o4z.n5(this.l6, new g7("r8", com.aspose.slides.ms.System.Xml.f4.k7(this.n5.z1())));
            break;
         case 22:
         case 23:
            this.n5.r4();
            return false;
         case 24:
            String var2 = this.n5.c4();
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  var2 = com.aspose.slides.ms.System.d1.n5(var2, this.n5.c4());
               }
            }

            o4z.n5(this.l6, new g7("lpwstr", var2));
            break;
         case 25:
         case 26:
            this.n5.r4();
            return false;
         case 27:
            this.n5.u9();
            o4z.n5(this.l6, new g7("filetime", com.aspose.slides.ms.System.j5.n5(this.n5.z1(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3()));
            break;
         case 28:
            this.n5.u9();
            o4z.n5(this.l6, new g7("bool", com.aspose.slides.ms.System.Xml.f4.t2(this.n5.z1())));
            break;
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
            this.n5.r4();
            return false;
         default:
            return false;
      }

      return true;
   }
}
