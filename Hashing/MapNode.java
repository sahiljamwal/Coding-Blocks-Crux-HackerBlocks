package Hashing;

//MapNode Class for creating map nodes in java
public class MapNode<K, V> {
	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
