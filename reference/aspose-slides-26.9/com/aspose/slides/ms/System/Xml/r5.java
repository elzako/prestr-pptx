package com.aspose.slides.ms.System.Xml;

public class r5 {
   private com.aspose.slides.ms.System.u8 n5;
   private XmlDocument l6;
   private g8 k5 = null;

   public r5(XmlDocument var1, b9 var2) {
      this.l6 = var1;
      this.n5 = new com.aspose.slides.ms.System.u8(var2);
      this.k5 = new h9(this);
      var1.NodeInserted.l6(this.k5);
      var1.NodeRemoved.l6(this.k5);
   }

   private void n5(Object var1, p9 var2) {
      synchronized (this) {
         if (this.n5 != null) {
            b9 var4 = (b9)this.n5.n5();
            if (null != var4) {
               var4.n5(var2);
            } else {
               this.l6.NodeInserted.n5(this.k5);
               this.l6.NodeRemoved.n5(this.k5);
               this.n5 = null;
            }
         }
      }
   }

   public final void n5() {
      synchronized (this) {
         if (this.n5 != null) {
            this.l6.NodeInserted.n5(this.k5);
            this.l6.NodeRemoved.n5(this.k5);
            this.n5 = null;
         }
      }
   }

   // $VF: synthetic method
   static void n5(r5 var0, Object var1, p9 var2) {
      var0.n5(var1, var2);
   }
}
