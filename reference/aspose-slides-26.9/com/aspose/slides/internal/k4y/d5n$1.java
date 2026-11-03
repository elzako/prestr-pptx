package com.aspose.slides.internal.k4y;

class d5n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d5n l6;

   d5n$1(d5n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d5n.n5().n5(this.n5.n3())) {
         case 0:
            h5a var2 = new h5a(this.n5);
            d5n.n5(this.l6).addItem(new g7("rPr", var2));
            break;
         case 1:
            y4q var3 = new y4q(this.n5);
            d5n.n5(this.l6).addItem(new g7("alias", var3));
            break;
         case 2:
            y2k var4 = new y2k(this.n5);
            d5n.n5(this.l6).addItem(new g7("lock", var4));
            break;
         case 3:
            n6i var5 = new n6i(this.n5);
            d5n.n5(this.l6).addItem(new g7("placeholder", var5));
            break;
         case 4:
            a5j var6 = new a5j(this.n5);
            d5n.n5(this.l6).addItem(new g7("showingPlcHdr", var6));
            break;
         case 5:
            o9j var7 = new o9j(this.n5);
            d5n.n5(this.l6).addItem(new g7("dataBinding", var7));
            break;
         case 6:
            a5j var8 = new a5j(this.n5);
            d5n.n5(this.l6).addItem(new g7("temporary", var8));
            break;
         case 7:
            k4b var9 = new k4b(this.n5);
            d5n.n5(this.l6).addItem(new g7("id", var9));
            break;
         case 8:
            y4q var10 = new y4q(this.n5);
            d5n.n5(this.l6).addItem(new g7("tag", var10));
            break;
         case 9:
            v6m var11 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("equation", var11));
            break;
         case 10:
            x5z var12 = new x5z(this.n5);
            d5n.n5(this.l6).addItem(new g7("comboBox", var12));
            break;
         case 11:
            a5e var13 = new a5e(this.n5);
            d5n.n5(this.l6).addItem(new g7("date", var13));
            break;
         case 12:
            m9f var14 = new m9f(this.n5);
            d5n.n5(this.l6).addItem(new g7("docPartObj", var14));
            break;
         case 13:
            m9f var15 = new m9f(this.n5);
            d5n.n5(this.l6).addItem(new g7("docPartList", var15));
            break;
         case 14:
            x5x var16 = new x5x(this.n5);
            d5n.n5(this.l6).addItem(new g7("dropDownList", var16));
            break;
         case 15:
            v6m var17 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("picture", var17));
            break;
         case 16:
            v6m var18 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("richText", var18));
            break;
         case 17:
            s1d var19 = new s1d(this.n5);
            d5n.n5(this.l6).addItem(new g7("text", var19));
            break;
         case 18:
            v6m var20 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("citation", var20));
            break;
         case 19:
            v6m var21 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("group", var21));
            break;
         case 20:
            v6m var22 = new v6m(this.n5);
            d5n.n5(this.l6).addItem(new g7("bibliography", var22));
            break;
         default:
            return false;
      }

      return true;
   }
}
