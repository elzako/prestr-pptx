package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.internal.b8c.l2;
import com.aspose.slides.internal.b8c.u1s;
import com.aspose.slides.internal.b8c.v1;

public final class z0 extends x7 {
   private byte k5;
   private u1s u3;
   private j9e a6;
   private Object u9;

   public z0(String var1, String var2, String var3, int var4, XmlDocument var5, x7 var6, com.aspose.slides.internal.b8c.u4 var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.n5(var7.ak_());
      this.n5(var7.l6());
      this.l6(var7.aj_());
      this.u3 = var7.al_();
      this.a6 = var7.am_();
      this.u9 = var7.an_() != null ? var7.an_() : var7.ao_();
   }

   @Override
   public int ak_() {
      return this.n5.canReportValidity() ? this.k5 & 0xFF & 3 : 0;
   }

   @Override
   public boolean l6() {
      return (this.k5 & 255 & 4) != 0;
   }

   @Override
   public boolean aj_() {
      return (this.k5 & 255 & 8) != 0;
   }

   @Override
   public u1s al_() {
      return this.u3;
   }

   @Override
   public j9e am_() {
      return this.a6;
   }

   @Override
   public v1 an_() {
      return com.aspose.slides.internal.v6g.k5.n5(this.u9, v1.class);
   }

   @Override
   public l2 ao_() {
      return com.aspose.slides.internal.v6g.k5.n5(this.u9, l2.class);
   }

   public final void n5(int var1) {
      this.k5 = (byte)(this.k5 & 0xFF & -4 | (byte)var1 & 0xFF);
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.k5 = (byte)(this.k5 & 0xFF | 4);
      } else {
         this.k5 = (byte)(this.k5 & 0xFF & -5);
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.k5 = (byte)(this.k5 & 0xFF | 8);
      } else {
         this.k5 = (byte)(this.k5 & 0xFF & -9);
      }
   }

   @Override
   public boolean n5(com.aspose.slides.internal.b8c.u4 var1) {
      return var1 != null
         && var1.ak_() == (this.k5 & 255 & 3)
         && var1.l6() == ((this.k5 & 255 & 4) != 0)
         && var1.aj_() == ((this.k5 & 255 & 8) != 0)
         && var1.al_() == this.u3
         && var1.am_() == this.a6
         && var1.an_() == com.aspose.slides.internal.v6g.k5.n5(this.u9, v1.class)
         && var1.ao_() == com.aspose.slides.internal.v6g.k5.n5(this.u9, l2.class);
   }
}
