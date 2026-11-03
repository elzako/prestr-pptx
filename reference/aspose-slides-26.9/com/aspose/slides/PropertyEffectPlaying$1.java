package com.aspose.slides;

final class PropertyEffectPlaying$1 extends PropertyEffectPlaying$SetValueHandler {
   // $VF: synthetic field
   final e9 n5;
   // $VF: synthetic field
   final IShape l6;
   // $VF: synthetic field
   final IBehaviorProperty k5;

   PropertyEffectPlaying$1(e9 var1, IShape var2, IBehaviorProperty var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public void invoke(float value) {
      new PropertyEffectPlaying$n5(this.n5, (Shape)this.l6, this.k5.getValue()).n5(value);
   }
}
