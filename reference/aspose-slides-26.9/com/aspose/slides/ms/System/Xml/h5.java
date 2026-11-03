package com.aspose.slides.ms.System.Xml;

public class h5 extends s9 {
   public h5(String var1, XmlDocument var2) {
      super(var1, var2);
   }

   @Override
   public String getName() {
      return this.getOwnerDocument().strCommentName;
   }

   @Override
   public String getLocalName() {
      return this.getOwnerDocument().strCommentName;
   }

   @Override
   public int getNodeType() {
      return 8;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createComment(this.k5());
   }

   @Override
   public void writeTo(l1 w) {
      w.u9(this.k5());
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   @Override
   public int getXPNodeType() {
      return 8;
   }
}
