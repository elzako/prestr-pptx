package com.aspose.slides.ms.System.Xml;

public abstract class s9 extends e0 {
   private String n5;

   public s9(String var1, XmlDocument var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   public String getValue() {
      return this.k5();
   }

   @Override
   public void setValue(String value) {
      this.n5(value);
   }

   @Override
   public String getInnerText() {
      return this.getValue();
   }

   @Override
   public void setInnerText(String value) {
      this.setValue(value);
   }

   public String k5() {
      return this.n5 != null ? this.n5 : com.aspose.slides.ms.System.d1.n5;
   }

   public void n5(String var1) {
      l0 var2 = this.getParentNode();
      p9 var3 = this.getEventArgs(this, var2, var2, this.n5, var1, 2);
      if (var3 != null) {
         this.beforeEvent(var3);
      }

      this.n5 = var1;
      if (var3 != null) {
         this.afterEvent(var3);
      }
   }

   public final boolean l6(String var1) {
      return u4.n5().n5(var1);
   }

   public final boolean n5(l0 var1, int[] var2) {
      while (var1 != null) {
         switch (var1.getNodeType()) {
            case 3:
            case 4:
               var2[0] = 4;
               return false;
            case 5:
               if (!this.n5(var1.getFirstChild(), var2)) {
                  return false;
               }
               break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               return false;
            case 13:
               break;
            case 14:
               var2[0] = 5;
         }

         var1 = var1.getNextSibling();
      }

      return true;
   }
}
