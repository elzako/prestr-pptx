package com.aspose.slides;

public interface ISmartArtNodeCollection extends IGenericCollection<ISmartArtNode> {
   ISmartArtNode get_Item(int var1);

   ISmartArtNode addNode();

   void removeNode(int var1);

   void removeNode(ISmartArtNode var1);

   ISmartArtNode addNodeByPosition(int var1);
}
