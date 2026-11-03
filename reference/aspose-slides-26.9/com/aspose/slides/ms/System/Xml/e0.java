package com.aspose.slides.ms.System.Xml;

public abstract class e0 extends l0 {
   public e0 l6 = null;

   public e0() {
   }

   public e0(XmlDocument var1) {
      super(var1);
   }

   @Override
   public l0 getPreviousSibling() {
      l0 var1 = this.getParentNode();
      if (var1 == null) {
         return null;
      }

      l0 var2 = var1.getFirstChild();

      while (var2 != null) {
         l0 var3 = var2.getNextSibling();
         if (var3 == this) {
            break;
         }

         var2 = var3;
      }

      return var2;
   }

   @Override
   public l0 getNextSibling() {
      l0 var1 = this.getParentNode();
      return var1 != null && this.l6 != var1.getFirstChild() ? this.l6 : null;
   }
}
