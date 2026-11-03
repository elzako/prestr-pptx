package com.aspose.slides;

public final class RowFormat extends DomObject<Row> implements IRowFormat, q1v {
   private IPresentationComponent n5;
   private final long l6 = 1L;
   private j5h k5;

   RowFormat(Row row) {
      super(row);
   }

   @Override
   public final IRowFormatEffectiveData getEffective() {
      return this.k5();
   }

   final Row n5() {
      return this.u9;
   }

   final Table l6() {
      return this.u9.n5();
   }

   @Override
   public final long getVersion() {
      return (this.l6 & 4294967295L) + (this.l6().x8().getVersion() & 4294967295L) & 4294967295L;
   }

   final j5h k5() {
      if (this.k5 == null) {
         this.k5 = new j5h(this);
      }

      this.k5.n5(j5h.class);
      return this.k5;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.n5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.n5};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }
}
