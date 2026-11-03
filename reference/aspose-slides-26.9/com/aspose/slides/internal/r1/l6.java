package com.aspose.slides.internal.r1;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.q3.t2;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;

public class l6 extends t2 {
   private static final u9 n5 = new u9("anchor", "big", "blink", "bold", "fixed", "fontcolor", "fontsize", "italics", "link", "small", "strike", "sub", "sup");

   @Override
   public void l6() {
      this.k5("anchor");
      this.k5("big");
      this.k5("blink");
      this.k5("bold");
      this.k5("fixed");
      this.k5("fontcolor");
      this.k5("fontsize");
      this.k5("italics");
      this.k5("link");
      this.k5("small");
      this.k5("strike");
      this.k5("sub");
      this.k5("sup");
   }

   @Override
   public String n5() {
      return "String";
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      switch (n5.n5(var1)) {
         case 0:
            String var7 = var3.length > 0 ? var3[0].toString() : d1.n5;
            return this.n5(d1.n5("<a name=\"{1}\">{0}</a>", var2, var7));
         case 1:
            return this.n5(d1.n5("<big>{0}</big>", new Object[]{var2}));
         case 2:
            return this.n5(d1.n5("<blink>{0}</blink>", new Object[]{var2}));
         case 3:
            return this.n5(d1.n5("<b>{0}</b>", new Object[]{var2}));
         case 4:
            return this.n5(d1.n5("<tt>{0}</tt>", new Object[]{var2}));
         case 5:
            String var6 = var3.length > 0 ? var3[0].toString() : d1.n5;
            return this.n5(d1.n5("<font color=\"{1}\">{0}</font>", var2, var6));
         case 6:
            String var5 = var3.length > 0 ? var3[0].toString() : d1.n5;
            return this.n5(d1.n5("<font size=\"{1}\">{0}</font>", var2, var5));
         case 7:
            return this.n5(d1.n5("<i>{0}</i>", new Object[]{var2}));
         case 8:
            String var4 = var3.length > 0 ? var3[0].toString() : d1.n5;
            return this.n5(d1.n5("<a href=\"{1}\">{0}</a>", var2, var4));
         case 9:
            return this.n5(d1.n5("<small>{0}</small>", new Object[]{var2}));
         case 10:
            return this.n5(d1.n5("<strike>{0}</strike>", new Object[]{var2}));
         case 11:
            return this.n5(d1.n5("<sub>{0}</sub>", new Object[]{var2}));
         case 12:
            return this.n5(d1.n5("<sup>{0}</sup>", new Object[]{var2}));
         default:
            return super.n5(var1, var2, var3);
      }
   }
}
