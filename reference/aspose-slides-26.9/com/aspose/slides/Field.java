package com.aspose.slides;

public final class Field extends DomObject<Portion> implements IField {
   private IFieldType n5;
   private u3n l6 = new u3n();

   Field(Portion parentImmediate, Field field) {
      super(parentImmediate);
      this.n5(new ParagraphFormat(this));
      this.n5(field);
   }

   Field(Portion parentImmediate, FieldType fieldType) {
      super(parentImmediate);
      this.n5 = fieldType;
      this.n5(com.aspose.slides.ms.System.o0.l6().k5());
      this.n5(new ParagraphFormat(this));
   }

   final u3n n5() {
      return this.l6;
   }

   @Override
   public final IFieldType getType() {
      return this.n5;
   }

   @Override
   public final void setType(IFieldType value) {
      this.n5 = value;
   }

   final com.aspose.slides.ms.System.o0 l6() {
      return this.n5().l6();
   }

   final void n5(com.aspose.slides.ms.System.o0 var1) {
      this.n5().n5(var1.k5());
   }

   private void n5(Field var1) {
      this.n5 = var1.n5;
      this.u3().n5(var1.u3());
      this.n5(com.aspose.slides.ms.System.o0.l6().k5());
   }

   private ParagraphFormat u3() {
      return (ParagraphFormat)this.n5().n5();
   }

   private void n5(ParagraphFormat var1) {
      this.n5().n5(var1);
   }

   final Portion k5() {
      return this.u9;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.u9 != null ? this.u9.getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.u9 != null ? this.u9.getPresentation() : null;
   }
}
