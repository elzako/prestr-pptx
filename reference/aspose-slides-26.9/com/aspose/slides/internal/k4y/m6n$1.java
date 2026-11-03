package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

class m6n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m6n l6;

   m6n$1(m6n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m6n.m3().n5(this.n5.n3())) {
         case 11:
            m6n.n5(this.l6, new g1(this.n5));
            break;
         case 12:
            switch (m6n.m3().n5(m6n.n5(this.l6))) {
               case 2:
                  m6n.n5(this.l6, new c4(this.n5));
                  return true;
               case 3:
                  m6n.n5(this.l6, new x0d(this.n5));
                  return true;
               default:
                  return true;
            }
         case 13:
            m6n.n5(this.l6, new i3(this.n5));
            break;
         case 14:
            m6n.n5(this.l6, new u3(this.n5));
            break;
         case 15:
            m6n.n5(this.l6, new s8x(this.n5));
            break;
         case 16:
            m6n.n5(this.l6, new h4h(this.n5));
            break;
         case 17:
            m6n.n5(this.l6, new q7o(this.n5));
            break;
         case 18:
            m6n.n5(this.l6, new j5u(this.n5));
            break;
         case 19:
            m6n.n5(this.l6, new t4t(this.n5));
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", this.n5.n3(), "\""}));
      }

      return true;
   }
}
