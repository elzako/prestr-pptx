package com.aspose.slides;

public final class TemplateContext<TObject> {
   private final TObject n5;
   private final Output l6;
   private final Storage k5;
   private final Storage u3 = new Storage();

   TemplateContext(TObject obj, Output output, Storage global) {
      this.n5 = obj;
      this.l6 = output;
      this.k5 = global;
   }

   public final <TSubModel> TemplateContext<TSubModel> subModel(TSubModel subModel) {
      return new TemplateContext<>(subModel, this.l6, this.k5);
   }

   public final TObject getObject() {
      return this.n5;
   }

   public final Output getOutput() {
      return this.l6;
   }

   public final Storage getLocal() {
      return this.u3;
   }

   public final Storage getGlobal() {
      return this.k5;
   }
}
