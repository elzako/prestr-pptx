package com.aspose.slides.ms.System.Xml;

public class o4 extends u8 {
   private boolean n5 = false;

   public o4(String var1, String var2, String var3, XmlDocument var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean a6() {
      return this.n5;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      XmlDocument var2 = this.getOwnerDocument();
      o4 var3 = (o4)var2.createDefaultAttribute(this.getPrefix(), this.getLocalName(), this.getNamespaceURI());
      var3.copyChildren(var2, this, true);
      var3.n5 = true;
      return var3;
   }

   @Override
   public void setInnerText(String value) {
      super.setInnerText(value);
      this.n5 = true;
   }

   @Override
   public l0 insertBefore(l0 newChild, l0 refChild) {
      l0 var3 = super.insertBefore(newChild, refChild);
      this.n5 = true;
      return var3;
   }

   @Override
   public l0 insertAfter(l0 newChild, l0 refChild) {
      l0 var3 = super.insertAfter(newChild, refChild);
      this.n5 = true;
      return var3;
   }

   @Override
   public l0 replaceChild(l0 newChild, l0 oldChild) {
      l0 var3 = super.replaceChild(newChild, oldChild);
      this.n5 = true;
      return var3;
   }

   @Override
   public l0 removeChild(l0 oldChild) {
      l0 var2 = super.removeChild(oldChild);
      this.n5 = true;
      return var2;
   }

   @Override
   public l0 appendChild(l0 newChild) {
      l0 var2 = super.appendChild(newChild);
      this.n5 = true;
      return var2;
   }

   @Override
   public void writeTo(l1 w) {
      if (this.n5) {
         super.writeTo(w);
      }
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }
}
