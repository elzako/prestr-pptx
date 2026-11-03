package com.aspose.slides.internal.k4y;

class w7$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w7 l6;

   w7$2(w7 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w7.a6().n5(this.n5.n3())) {
         case 3:
            p0 var2 = new p0(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaBiLevel", var2));
            break;
         case 4:
            s1 var3 = new s1(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaCeiling", var3));
            break;
         case 5:
            g9 var4 = new g9(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaFloor", var4));
            break;
         case 6:
            l9 var5 = new l9(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaInv", var5));
            break;
         case 7:
            z2 var6 = new z2(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaMod", var6));
            break;
         case 8:
            m5 var7 = new m5(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaModFix", var7));
            break;
         case 9:
            p2 var8 = new p2(this.n5);
            w7.n5(this.l6).addItem(new g7("alphaRepl", var8));
            break;
         case 10:
            m7 var9 = new m7(this.n5);
            w7.n5(this.l6).addItem(new g7("biLevel", var9));
            break;
         case 11:
            f9 var10 = new f9(this.n5);
            w7.n5(this.l6).addItem(new g7("blur", var10));
            break;
         case 12:
            x4 var11 = new x4(this.n5);
            w7.n5(this.l6).addItem(new g7("clrChange", var11));
            break;
         case 13:
            l3 var12 = new l3(this.n5);
            w7.n5(this.l6).addItem(new g7("clrRepl", var12));
            break;
         case 14:
            d4n var13 = new d4n(this.n5);
            w7.n5(this.l6).addItem(new g7("duotone", var13));
            break;
         case 15:
            k1d var14 = new k1d(this.n5);
            w7.n5(this.l6).addItem(new g7("fillOverlay", var14));
            break;
         case 16:
            l2p var15 = new l2p(this.n5);
            w7.n5(this.l6).addItem(new g7("grayscl", var15));
            break;
         case 17:
            t1z var16 = new t1z(this.n5);
            w7.n5(this.l6).addItem(new g7("hsl", var16));
            break;
         case 18:
            k3h var17 = new k3h(this.n5);
            w7.n5(this.l6).addItem(new g7("lum", var17));
            break;
         case 19:
            j8o var18 = new j8o(this.n5);
            w7.n5(this.l6).addItem(new g7("tint", var18));
            break;
         case 20:
            w7.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
