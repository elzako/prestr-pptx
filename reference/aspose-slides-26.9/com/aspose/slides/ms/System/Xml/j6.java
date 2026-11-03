package com.aspose.slides.ms.System.Xml;

public class j6 extends e0 {
   private String n5;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private f8 h0;
   private f8 c8;
   private com.aspose.slides.internal.b8c.x0 t2;

   public j6(String var1, String var2, String var3, String var4, XmlDocument var5) {
      super(var5);
      this.n5 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.u9 = true;
      this.a6 = var4;
      if (!var5.isLoading()) {
         var5.setLoading(true);
         i2 var6 = new i2();
         var6.n5(this);
         var5.setLoading(false);
      }
   }

   @Override
   public String getName() {
      return this.n5;
   }

   @Override
   public String getLocalName() {
      return this.n5;
   }

   @Override
   public int getNodeType() {
      return 10;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createDocumentType(this.n5, this.k5, this.u3, this.a6);
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public final f8 n5() {
      if (this.h0 == null) {
         this.h0 = new f8(this);
      }

      return this.h0;
   }

   public final f8 l6() {
      if (this.c8 == null) {
         this.c8 = new f8(this);
      }

      return this.c8;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final boolean u9() {
      return this.u9;
   }

   @Override
   public void writeTo(l1 w) {
      w.n5(this.n5, this.k5, this.u3, this.a6);
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   public final com.aspose.slides.internal.b8c.x0 h0() {
      return this.t2;
   }

   public final void n5(com.aspose.slides.internal.b8c.x0 var1) {
      this.t2 = var1;
   }
}
