package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.DOMResourcesUtils;

class g8h extends y8g {
   private byte l6;
   static final byte[] n5 = new byte[]{
      -128,
      122,
      31,
      -16,
      97,
      0,
      0,
      0,
      -28,
      66,
      -17,
      93,
      34,
      -78,
      -29,
      -126,
      73,
      60,
      57,
      107,
      2,
      -69,
      -33,
      95,
      -60,
      40,
      0,
      0,
      0,
      8,
      0,
      0,
      0,
      8,
      0,
      0,
      0,
      1,
      0,
      1,
      0,
      0,
      0,
      0,
      0,
      32,
      0,
      0,
      0,
      -119,
      11,
      0,
      0,
      -119,
      11,
      0,
      0,
      2,
      0,
      0,
      0,
      2,
      0,
      0,
      0,
      -1,
      -1,
      -1,
      0,
      0,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      -9,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      -1,
      0,
      0,
      0,
      127,
      0,
      0,
      0
   };

   g8h(byte var1, j1 var2) {
      super(var2);
      this.l6 = var1;
      var2.n3().addItem(this.l6, this);
   }

   @Override
   com.aspose.slides.internal.k0r.l8 n5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(n5);
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.k0r.l8 var3 = com.aspose.slides.internal.v6g.k5.n5(
         com.aspose.slides.internal.k0r.p5k.n5(var2), com.aspose.slides.internal.k0r.l8.class
      );
      byte[] var4 = DOMResourcesUtils.getResourceBytes("resources/patterns", com.aspose.slides.ms.System.d1.n5(new String[]{s8f.n5(s1f.h0(this.l6)), ".dat"}));
      com.aspose.slides.ms.System.o0 var5 = DOMResourcesUtils.getResourceGuid(
            "resources/patterns", com.aspose.slides.ms.System.d1.n5(new String[]{s8f.n5(s1f.h0(this.l6)), " Guid.dat"})
         )
         .k5();
      var3.n5(var4);
      var3.n5(var5.k5());
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.k0r.j8.class)) {
         ((com.aspose.slides.internal.k0r.j8)var3).n5(this.n5(this.l6));
      }

      return var3;
   }

   private byte n5(byte var1) {
      switch (var1) {
         case -1:
         case 0:
         default:
            throw new Exception();
         case 1:
            return -60;
         case 2:
            return -52;
         case 3:
            return -44;
         case 4:
            return -36;
         case 5:
            return -28;
         case 6:
            return -20;
         case 7:
            return -59;
         case 8:
            return -51;
         case 9:
            return -43;
         case 10:
            return -35;
         case 11:
            return -27;
         case 12:
            return -19;
         case 13:
         case 49:
            return -17;
         case 14:
         case 50:
            return -25;
         case 15:
         case 52:
            return -42;
         case 16:
         case 53:
            return -34;
         case 17:
            return -37;
         case 18:
            return -22;
         case 19:
            return -49;
         case 20:
            return -57;
         case 21:
            return -58;
         case 22:
            return -50;
         case 23:
            return -53;
         case 24:
            return -38;
         case 25:
            return -26;
         case 26:
            return -18;
         case 27:
            return -56;
         case 28:
            return -48;
         case 29:
            return -41;
         case 30:
            return -33;
         case 31:
            return -32;
         case 32:
            return -40;
         case 33:
            return -16;
         case 34:
            return -45;
         case 35:
            return -31;
         case 36:
            return -29;
         case 37:
            return -24;
         case 38:
            return -55;
         case 39:
            return -13;
         case 40:
            return -39;
         case 41:
            return -21;
         case 42:
            return -15;
         case 43:
            return -14;
         case 44:
            return -23;
         case 45:
            return -46;
         case 46:
            return -54;
         case 47:
            return -30;
         case 48:
            return -47;
         case 51:
         case 54:
            throw new NotImplementedException();
      }
   }
}
